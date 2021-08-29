package lesson4;

import lesson2.ArraySort;

import java.util.*;

public class MyStack {
    private int x;

    public MyStack(int x) {
        this.x = x;
    }

    public void print(){
        System.out.print(x + " ");
    }

    public static void main(String[] args) {
        Stack<MyStack> stack = new Stack<>();
        Queue<MyStack> queue = new LinkedList<>();
        Deque<MyStack> deque = new ArrayDeque<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        ArraySort arraySort = new ArraySort();
        int[] array = arraySort.generationArray(400);
        Integer[] arrInt = new Integer[400];
        Random random = new Random();

        long q = System.nanoTime();
        for (int o : array) {
            stack.push(new MyStack(o));
        }
        while (!stack.empty())
        stack.pop().print();
        System.out.println("\n" + (System.nanoTime() - q));

        q = System.nanoTime();
        for (int o : array) {
            queue.add(new MyStack(o));
        }
        while (!queue.isEmpty())
            queue.poll().print();
        System.out.println("\n" + (System.nanoTime() - q));

        q = System.nanoTime();
        for (Integer o : arrInt) {
            o = random.nextInt(400);
            priorityQueue.add(o);
        }
        while (!priorityQueue.isEmpty()){
            System.out.print(priorityQueue.poll() + " ");
        }
        System.out.println("\n" + (System.nanoTime() - q));

        q = System.nanoTime();
        System.out.println("------- My Stack --------");
        MyStackList myStackList = new MyStackList();
        for (int o : array) {
            myStackList.push(o);
        }

        System.out.println("\n" + "--------- My Queue --------");
        MyQueue myQueue = new MyQueue();
        for (int o : array) {
            myQueue.insert(o);
        }
        System.out.println(System.nanoTime() - q);
    }
}
