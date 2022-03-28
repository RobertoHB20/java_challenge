package streams.challenge;

import lombok.*;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@ToString
public class Item {

    private int id;
    private String name;
    private String description;
    private String manufacturer;
    private int price;


    public static List<Item> sortByIdAsc(List<Item> items){

        return items.stream().sorted( Comparator.comparing( e -> e.getId() ) ).collect(Collectors.toList());
    }

    public static List<Item> getItemByName(String name,List<Item> items ){

        return items.stream().filter( e -> e.getName().contains( name) ).collect(Collectors.toList());
    }

    public static Item getExpensiveItem(List<Item> items) {

        return items.stream().max( Comparator.comparing(Item::getPrice) ).get();
    }

    public static OptionalDouble getAveragePrices(List<Item> items){

        return items.stream().mapToInt( e -> e.price).average();
    }

    public static Item getCheapestItem(List<Item> items){

        return items.stream().min(Comparator.comparing(Item::getPrice)).get();
    }
}
