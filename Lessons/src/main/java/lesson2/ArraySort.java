package lesson2;

import java.util.Arrays;
import java.util.Random;

public class ArraySort {

    private int[] arr;

    public void swap(int[] arr, int first, int second){
        int buff = arr[first];
        arr[first] = arr[second];
        arr[second] = buff;
    }

    public int[] generationArray(int length){
        this.arr = new int[length];
        int[] arr = new int[length];
        Random random = new Random();
        for(int i = 0; i < length; i++){
            arr[i] = random.nextInt(500);
        }
        return arr;
    }

    public int[] sort(int[] arr){
        Arrays.sort(arr);
        return arr;
    }

    public void bubbleSort(int[] arr){
        for(int i = arr.length - 1; i >= 1; i--){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j + 1]){
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int buff = i;
            for (int j = i; j < arr.length; j++){
                if(arr[j] < arr[buff]){
                    buff = j;
                }
            }
            swap(arr, i, buff);
        }
    }

    public void insertionSort( int[] arr){
        for(int i = 0; i < arr.length; i++){
            int buff = arr[i];
            int j = i - 1;
            for (; j >= 0; j--){
                if(buff < arr[j]){
                    arr[j + 1] = arr[j];
                }else {
                    break;
                }
            }
            arr[j + 1] = buff;
        }
    }
}
