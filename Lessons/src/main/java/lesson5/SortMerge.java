package lesson5;

import java.util.Arrays;

public class SortMerge {

    public int[] sortMerge(int[] arr){
        int len = arr.length;
        if(len < 2) return arr;
        int middle = len / 2;
        return merge(sortMerge(Arrays.copyOfRange(arr, 0, middle)),
                sortMerge(Arrays.copyOfRange(arr, middle, len)));
    }

    public int[] merge(int[] a, int[] b){
        int[] result = new int[a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;

        for(int i = 0; i< result.length; i++){
            result[i] = a[aIndex] < b[bIndex] ? a[aIndex] : b[bIndex];
            if(aIndex == a.length){
                System.arraycopy(b, bIndex, result, ++i, b.length - bIndex);
                break;
            }if(bIndex == b.length){
                System.arraycopy(a, aIndex, ++i, a.length, - aIndex);
                break;
            }
        }
        return result;
    }
}
