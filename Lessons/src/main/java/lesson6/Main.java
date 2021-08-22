package lesson6;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        long t = System.nanoTime();
        tree.insert(new Person(1, "Bob", 16));
        tree.insert(new Person(3, "Billy", 19));
        tree.insert(new Person(2, "John", 31));
        tree.insert(new Person(5, "Tom", 45));
        tree.insert(new Person(6, "Garold", 33));
        tree.insert(new Person(8, "Mick", 27));
        tree.insert(new Person(7, "Jack", 55));
        System.out.println("Insert time: " + (System.nanoTime() - t));

        t = System.nanoTime();
        tree.max().print();
        tree.min().print();
        System.out.println("Print max/min: " + (System.nanoTime() - t));
        System.out.println("------- ------- ------- -------");

        t = System.nanoTime();
        tree.find(3).print();
        System.out.println("Search ID: " + (System.nanoTime() - t));
        System.out.println("-------- ------ -------- -------");

        t = System.nanoTime();
        tree.delete(4);
        System.out.println("Delete ID: " + (System.nanoTime() - t));
        System.out.println();

        tree.printTree();
        System.out.println("-------- ------ -------- -------");

        int[] arr = new int[50];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        HeapSort heapSort = new HeapSort();

        t = System.nanoTime();
        heapSort.sort(arr);
        System.out.println(System.nanoTime() - t);
        System.out.println(Arrays.toString(arr));
    }
}
