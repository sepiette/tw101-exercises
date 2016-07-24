package com.thoughtworks.tw101.exercises.exercise9;

import java.util.LinkedList;
import java.util.List;

public class Node {
    private String name;
    private Node left;
    private Node right;

    public Node(String name) {
        this.name = name;
        this.left = null;
        this.right = null;
    }

    public void add(String nameOfNewNode) {
        if (this.name.compareToIgnoreCase(nameOfNewNode) > 0){
                if(this.left != null){
                    this.left.add(nameOfNewNode);
                }
                else{
                    this.left = new Node(nameOfNewNode);
                }
        }

        else if(this.name.compareToIgnoreCase(nameOfNewNode) < 0){
                if(this.right != null){
                    this.right.add(nameOfNewNode);
                }
                else{
                    this.right = new Node(nameOfNewNode);
                }
        }
        else{
            return;
        }
    }

    public List<String> names() {
        LinkedList<String> nameList = new LinkedList();
        nameList = inOrderTraverse(this,nameList);
        return nameList;
    }
    private LinkedList<String> inOrderTraverse(Node root, LinkedList<String> names){

        if (root == null)  {return null;}

        inOrderTraverse(root.left,names);
        names.add(root.name);
        inOrderTraverse(root.right,names);

        return names;
    }
}
