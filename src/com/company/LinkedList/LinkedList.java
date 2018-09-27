package com.company.LinkedList;

public class LinkedList {
    Node head;

    /* Utility function to insert a node at the beginning */
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    /* Utility function for displaying linked list */
    public void printList()
    {
        Node node = head;
        int count=10;
        while (node != null && count>0)
        {
            System.out.print(node.data + " ");
            node = node.next;
            count--;
        }
        System.out.println("");
    }
    public void swapkth(int k){
        if(head==null)
            return;
        if(head.next==null)
            return;
        Node t1 = head;
        int n = 0;

        while(t1!=null){
            n++;
            t1=t1.next;
        }
        if(k>n)
            return;
        if(2*k-1==n)
            return;
        Node x= head;
        Node x_prev=null;

        Node y= head;
        Node y_prev=null;

        int k1 = k;
        while(k1>1){
            x_prev=x;
            x=x.next;
            k1--;
        }
        int k2=n-k+1;
        while(k2>1){
            y_prev=y;
            y=y.next;
            k2--;
        }
        if(y_prev!=null && x_prev !=null){
            Node t3=y.next;
            x_prev.next=y;
            y.next=x.next;
            y_prev.next=x;
            x.next=t3;
        }else{
            if(x_prev==null){
                y.next=x.next;
                y_prev.next=x;
                x.next=null;
                head=y;
            }
            else{
                x.next=y.next;
                x_prev.next=y;
                y.next=null;
                head=x;

            }
        }


    }
}
