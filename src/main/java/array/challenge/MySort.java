package array.challenge;

import java.util.Arrays;

public class MySort {


    public static int[] defaultSort(int [] array){

        int[] result = Arrays.stream(array).sorted().toArray();

        return result;
    }

    public static int[] customSort(int [] array){
        int[] sorted_arr = array;

        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < array.length - 1; j++){
                if( sorted_arr[j] > sorted_arr[j+1]){
                    int aux = sorted_arr[j+1];
                    sorted_arr[j+1] = sorted_arr[j];
                    sorted_arr[j] = aux;
                }
            }
        }

        return sorted_arr;
    }


}
