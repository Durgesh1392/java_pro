package com.list;

public class ReverseList
{   Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next = null;
        }
    }
    public void printList()
    {
        Node t_node = head;
        while(t_node != null)
        {
            System.out.print(t_node.data + " --> ");
            t_node = t_node.next;
        }
        System.out.println("null");
    }
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;

    }
    public void reverse()
    {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while( curr.next != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;

    }

    public static void main(String[] args) {
        ReverseList r_list = new ReverseList();
        for(int i =7;i>0;i--)
        {
            r_list.push(i);
        }
        r_list.printList();
        r_list.reverse();
        r_list.printList();

    }
}
