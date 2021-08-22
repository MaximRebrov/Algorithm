package lesson3;

public class MyList<T>{

    private MyLinkedList<T> head;

    public MyList(){
        head = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void add(T element){
        MyLinkedList<T> myLinkedList = new MyLinkedList(element);
        myLinkedList.next = head;
        this.head = myLinkedList;
    }

    public MyLinkedList<T> remove(){
        MyLinkedList<T> myLinkedList = head;
        head = head.next;
        return myLinkedList;
    }

    public void removeKey(T key){
        MyLinkedList<T> myLinkedList = head;
        MyLinkedList<T> myLinkedListPrev = head;

        while (myLinkedList.element != key){
            if (isEmpty()){
                System.out.println(" list is empty");
            }else {
                myLinkedListPrev = myLinkedList;
                myLinkedList = myLinkedList.next;
            }
            if(myLinkedList == head){
                head = head.next;
            }else {
                myLinkedListPrev.next = myLinkedList.next;
            }
        }
    }

    public T search(T key){
        MyLinkedList<T> myLinkedList = new MyLinkedList<>(key);
        MyLinkedList<T> current = head;

        try {
            while (head != null) {
                if (current.element.equals(myLinkedList.element)) {
                    return myLinkedList.element;
                }
                current = current.next;
            }
        }catch (NullPointerException ex){

        }

        return null;
    }

    public void print(){
        MyLinkedList<T> myLinkedList = head;

        while (myLinkedList != null){
            System.out.print(myLinkedList.element + " ");
            myLinkedList = myLinkedList.next;
        }
    }
}
