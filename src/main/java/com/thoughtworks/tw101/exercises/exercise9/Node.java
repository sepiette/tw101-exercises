package com.thoughtworks.tw101.exercises.exercise9;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Node {
    private String name;
    private Node next;

    public Node(String name) {
        this.name = name;

        this.next = null;
    }

    public void add(String nameOfNewNode) {
        if(this.next != null){
            this.next.add(nameOfNewNode);
        }
        else{
            this.next = new Node(nameOfNewNode);
        }
    }

    public List<String> names() {
        LinkedList<String> nameList = new LinkedList();
        Node currNode = this;
        while(currNode != null){
            nameList.add(currNode.name);
            currNode = currNode.next;
        }
        Collections.sort(nameList);
        return nameList;
    }
}
