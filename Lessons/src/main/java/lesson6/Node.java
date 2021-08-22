package lesson6;

public class Node {

    public Person person;
    public Node leftChild;
    public Node rightChild;

    public void print(){
        System.out.println("id: " + person.id +" Name: " + person.name + " Age: " + person.age);
    }
}
