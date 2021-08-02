package lesson2;

public class ArraySearch {

    public void linearSearch(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(search)) {
                System.out.println("Linear search result: " + arr[i] + " index: " + i);
            }
        }
    }

    public String binarySearch(String[] arr, String search) {
        int low = 0;
        int mid;
        int high = arr.length - 1;

        while (low <= high){
            mid = (low + high) / 2;

            if(arr[mid].compareTo(search) < 0){
                low = mid + 1;
            }else if(arr[mid].compareTo(search) > 0){
                high = mid - 1;
            }else{
                return arr[mid];
            }
        }
        return null;
    }
}
