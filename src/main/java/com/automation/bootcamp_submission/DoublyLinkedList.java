package com.automation.bootcamp_submission;

		
	public class DoublyLinkedList {

		public void append(int i) {
			// TODO Auto-generated method stub
			
		}

		public void displayForward() {
			// TODO Auto-generated method stub
			
		}

		public void displayBackward() {
			// TODO Auto-generated method stub
			
		}

}
	class Node {
	    int data;
	    Node prev;
	    Node next;

	    public Node(int data) {
	        this.data = data;
	        this.prev = null;
	        this.next = null;
	    }
	
	    private Node head;
	    private Node tail;

	    public void DoublyLinkedList() {
	        this.head = null;
	        this.tail = null;
	    }

	    // Method to add a node to the end of the doubly-linked list
	    public void append(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            // List is empty, set both head and tail to the new node
	            head = newNode;
	            tail = newNode;
	        } else {
	            // Append the new node to the end of the list
	            tail.next = newNode;
	            newNode.prev = tail;
	            tail = newNode;
	        }
	    }

	    // Method to display the elements of the doubly-linked list in forward direction
	    public void displayForward() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }

	    // Method to display the elements of the doubly-linked list in reverse direction
	    public void displayBackward() {
	        Node current = tail;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.prev;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        DoublyLinkedList dll = new DoublyLinkedList();

	        // Appending nodes to the doubly-linked list
	        dll.append(1);
	        dll.append(2);
	        dll.append(3);
	        dll.append(4);

	        // Displaying the doubly-linked list in forward direction
	        System.out.println("Doubly-linked list (forward):");
	        dll.displayForward();

	        // Displaying the doubly-linked list in reverse direction
	        System.out.println("Doubly-linked list (backward):");
	        dll.displayBackward();
	    }
	}
