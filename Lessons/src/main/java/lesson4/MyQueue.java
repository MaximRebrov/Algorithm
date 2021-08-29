package lesson4;

import lesson3.MyList;

public class MyQueue<T> {
    private MyList queue;

    public MyQueue(){
        queue = new MyList();
    }

    public void insert(int element){
        queue.add(element);
    }

    public T remove(){
        return (T) queue.remove();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public void print(){
        queue.print();
    }
}
