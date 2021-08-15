package lesson3;

class List <T>{

    private LinkedList<T> head;

    public List(){
        head = null;
    }

    private boolean isEmpty(){
        return head == null;
    }

    public void add(T element){
        LinkedList<T> linkedList = new LinkedList(element);
        linkedList.next = head;
        this.head = linkedList;
    }

    public LinkedList<T> remove(){
        LinkedList<T> linkedList = head;
        head = head.next;
        return linkedList;
    }

    public void removeKey(T key){
        LinkedList<T> linkedList = head;
        LinkedList<T> linkedListPrev = head;

        while (linkedList.element != key){
            if (isEmpty()){
                System.out.println(" list is empty");
            }else {
                linkedListPrev = linkedList;
                linkedList = linkedList.next;
            }
            if(linkedList == head){
                head = head.next;
            }else {
                linkedListPrev.next = linkedList.next;
            }
        }
    }

    public T search(T key){
        LinkedList<T> linkedList = new LinkedList<>(key);
        LinkedList<T> current = head;

        try {
            while (head != null) {
                if (current.element.equals(linkedList.element)) {
                    return linkedList.element;
                }
                current = current.next;
            }
        }catch (NullPointerException ex){

        }

        return null;
    }

    public void print(){
        LinkedList<T> linkedList = head;

        while (linkedList != null){
            System.out.print(linkedList.element + " ");
            linkedList = linkedList.next;
        }
    }
}
