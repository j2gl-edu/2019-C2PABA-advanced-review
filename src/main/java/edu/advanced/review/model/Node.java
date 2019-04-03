package edu.advanced.review.model;

public class Node {

    private String firstName;
    private String lastName;
    private Node next;

    public Node(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Node() {
        System.out.println(this.toString() + " was instanced");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }


    @Override
    public void finalize() {
        System.out.println(this.toString() + " was finalized with the Garbage Collector");
    }
}
