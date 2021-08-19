package lesson5;

public class BinarySearch {

    public int binarySearch(int[] arr, int key, int low , int high) {
        if(low > high){
            return arr.length;
        }
        int mid = (low + high) / 2;

        if(arr[mid] == key){
            return mid;
        }else if(arr[mid] < key){
            return binarySearch(arr, key, low + 1, high);
        }else {
            return binarySearch(arr, key, low, high - 1);
        }
    }
}
