package streams.challenge;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ItemTest {

    List<Item> items;
    @BeforeAll
    public void init(){
        items = new ArrayList<>();
        items.add( Item.builder().id(3).name("Xiaomi Note 10").description("Luxury cellphone").manufacturer("Xiaomi").price(100).build() );
        items.add( Item.builder().id(4).name("Samsung Galaxy 10").description("Top level cellphone").manufacturer("Samsung").price(200).build() );
        items.add( Item.builder().id(1).name("M1").description("Cheap cellphone").manufacturer("Generic").price(20).build() );
        items.add( Item.builder().id(2).name("Lenovo T420").description("Refurbished laptop").manufacturer("Lenovo").price(50).build() );
    }


    @Test
    @DisplayName("Test to sort by id asc")
    public void SortListByIdAscTest(){
        List<Item> items_result = new ArrayList<>();
        items_result.add( Item.builder().id(1).name("M1").description("Cheap cellphone").manufacturer("Generic").price(20).build() );
        items_result.add( Item.builder().id(2).name("Lenovo T420").description("Refurbished laptop").manufacturer("Lenovo").price(50).build() );
        items_result.add( Item.builder().id(3).name("Xiaomi Note 10").description("Luxury cellphone").manufacturer("Xiaomi").price(100).build() );
        items_result.add( Item.builder().id(4).name("Samsung Galaxy 10").description("Top level cellphone").manufacturer("Samsung").price(200).build() );

        assertEquals( items_result, Item.sortByIdAsc(items));
    }

    @Test
    @DisplayName("Test to find products by name")
    public void FindItemsByNameTest(){
        List<Item> items_result = new ArrayList<>();
        items_result.add( Item.builder().id(2).name("Lenovo T420").description("Refurbished laptop").manufacturer("Lenovo").price(50).build() );

        assertEquals(items_result, Item.getItemByName( "Lenovo", items ));
    }

    @Test
    @DisplayName("Test to find the most expensive item")
    public void FindMostExpensiveItemsTest(){
        Item item_result = Item.builder().id(4).name("Samsung Galaxy 10").description("Top level cellphone").manufacturer("Samsung").price(200).build() ;
        assertEquals(item_result, Item.getExpensiveItem(items));
    }

    @Test
    @DisplayName("Test to find average of prices")
    public void FindAveragePricesOfItemsTest(){

        assertEquals(Double.valueOf(92.5), Item.getAveragePrices(items).getAsDouble());
    }

    @Test
    @DisplayName("Test to find cheapest item")
    public void FindCheapestItemTest(){
        Item item_result = Item.builder().id(1).name("M1").description("Cheap cellphone").manufacturer("Generic").price(20).build() ;
        assertEquals(item_result, Item.getCheapestItem(items));
    }






}