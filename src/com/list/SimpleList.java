package com.list;

public class SimpleList {
    Node head ;
    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data + " -> ");
            tnode = tnode.next;
        }
        System.out.println("null");
    }
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;

    }
    public static void main(String[] args)
    {
        SimpleList List = new SimpleList();
        for(int i=0; i<5;i++)
        {
            List.push(i);
        }
        List.printList();
    }
}
