package lesson4;

import lesson3.MyList;

public class MyStackList<T> {
    private MyList linkedMyList;

    public MyStackList(){
        linkedMyList = new MyList();
    }

    public void push(T elemement){
        linkedMyList.add(elemement);
    }

    public T pop(){
        return (T) linkedMyList.remove().element;
    }

    public boolean isEmpty(){
        return linkedMyList.isEmpty();
    }

    public void print(){
        linkedMyList.print();
    }
}