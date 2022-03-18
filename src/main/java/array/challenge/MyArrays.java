package array.challenge;

import java.util.Arrays;
import java.util.Comparator;

public class MyArrays {

    public static void main(String[] args) {

        int[] numbrs = new int[]{6,3,1,2,7,5,4,8,9};

        int[] result = MySort.defaultSort(numbrs);
        int[] result2 = MySort.customSort(numbrs);

        System.out.println("Ordenamiento por metodo Arrays");
        System.out.println(Arrays.toString(result));
        System.out.println("Ordenamito por metodo propio");
        System.out.println(Arrays.toString(result2));


        // SORT de un arreglo de objetos
        Item[] items = {
                new Item(7, "iPhone", 30),
                new Item(3, "Xiaomi", 15),
                new Item(9, "SAmsung", 45),
        };

        Arrays.sort(items, Comparator.comparingInt(item -> item.getPrice()));
        System.out.println("");
        System.out.println("Order de objeros por precio");
        System.out.println(Arrays.toString(items));

    }
}
