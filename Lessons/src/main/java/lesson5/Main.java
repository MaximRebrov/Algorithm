package lesson5;

import java.util.Arrays;
import java.util.Random;

public class Main {
    private static int score = 0;
    public static void main(String[] args) {
        String word = "Blink-";
        int blink = 0;

        recurse(word, blink);
        System.out.println("----- ----- ------ -----");
//        infiniteRecursion(word, blink);

        Random random = new Random();
        int[] array = new int[20];
        long t = System.nanoTime();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
        }
        System.out.print(Arrays.toString(array) + "\n" + (System.nanoTime() - t));
        System.out.println("\n ------- ------- ------- -------");
        t = System.nanoTime();
        recurs(array);
        System.out.print(Arrays.toString(array) + "\n" + (System.nanoTime() - t) + "\n");

        /* Задание 5.5
        Реализуйте алгоритм двоичного рекурсивного поиска на основе
        массива из задания 2.1.*/
        array[15] = 6;
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        BinarySearch binarySearch = new BinarySearch();
        t = System.nanoTime();
        binarySearch.binarySearch(array, 6, 0 ,array.length - 1 );
        System.out.println(System.nanoTime() - t);

        SortMerge sortMerge = new SortMerge();
        t = System.nanoTime();
        sortMerge.sortMerge(array);
        System.out.println(System.nanoTime() - t);
        System.out.println(Arrays.toString(array));
    }

    /* Задание 5.2
       Реализуйте простой пример бесконечной рекурсии и обычной рекурсии
       с условием для выхода. */
    public static void recurse(String word, int blink){
        if(blink == 182){
            System.out.println(word + blink);
            return;
        }
        System.out.println(word + "...");
        recurse(word, blink + 1);
    }

    public static void infiniteRecursion (String word, int blink){
        System.out.println(word + blink);
        infiniteRecursion(word, blink + 1);
    }
    /* ----------------------------------------------------- */

    /* Задание 5.4
        Реализуйте простой алгоритм использующий цикл и простой алгоритм
        использующий рекурсию.*/
    public static int[] recurs(int[] array){
        Random random = new Random();
        if(score == array.length){
            return array;
        }
        array[score] = random.nextInt(100);
        score++;
        return recurs(array);
    }
    /* ----------------------------------------------------- */
}
