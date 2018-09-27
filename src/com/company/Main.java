package com.company;

import com.company.LinkedList.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code heren
        LinkedList linkedList = new LinkedList();
        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(3);
        linkedList.push(4);
        linkedList.push(5);
        linkedList.printList();
        linkedList.swapkth(4);
        linkedList.printList();

    }
}