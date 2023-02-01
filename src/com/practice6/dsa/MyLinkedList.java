package com.practice6.dsa;

public class MyLinkedList {
    public static void main(String[] args) {
        MyNode myNode = new MyNode();
/*        myNode.addFirst("Shashank");
        myNode.addLast("22 years old");
        myNode.addFirst("I am");
 */
        myNode.add("I am");
        myNode.add("Shashank");
        myNode.add("22 years old");
        myNode.printList();
        System.out.println(myNode.getSize());
    }
}
