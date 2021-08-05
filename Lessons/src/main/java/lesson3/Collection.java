package lesson3;

import lesson2.ArraySort;

import java.util.*;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Collection {

    public static void main(String[] args) {

        String[] arr = new String[]{"Bee", "Cheel", "Bals", "Milk", "Nous", "Beep"};
        List<String> arrList = new ArrayList<>();

        long a = System.nanoTime();
        List<String> arrLinkedList = Arrays.stream(arr).collect(Collectors.toCollection(LinkedList :: new));
        arrList = Arrays.asList(arr);
        System.out.println(System.nanoTime() - a);

        long q = System.nanoTime();
        arrLinkedList.add(0, "Biba");
        arrLinkedList.remove(0);
        arrLinkedList.get(1);
        arrLinkedList.set(2, "Moove");
        System.out.println(System.nanoTime() - q);
        System.out.println("---- ---- ---- ----");

//        for (String o : arrList) {
//            System.out.println(o);
//        }
//        System.out.println("");
//        for (String o : arrLinkedList) {
//            System.out.println(o);
//        }

        lesson3.List list = new lesson3.List();
        ArraySort arraySort = new ArraySort();
        int[] array = arraySort.generationArray(50);
        long w = System.nanoTime();
        for (int o : array) {
            list.add(o);
        }
        list.add(111);
        list.print();
        System.out.println("");
        System.out.println(list.search(2));
        System.out.println(System.nanoTime() - w);
        System.out.println("-------- --------- --------");

        long z = System.nanoTime();
        ListIterator iterator = arrLinkedList.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("---- ---- ---- ----");
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println(System.nanoTime() - z);
    }
}
