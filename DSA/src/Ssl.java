import java.util.Scanner;

import SinglyLinkedList.ListNode;

public class Ssl {
	private Node head;
	private static class Node {
		private int data;
		private Node next;
	public Node (int value) {
		this.data = value;
		this.next = null;
	}
	}
	
	public void create(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to be added to the first element of the linkedList : ");
		int value = sc.nextInt();
		head = new Node(value);
		display();
	}
	
	public void add() {
		Node current = head;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to be added to linkedList : ");
		int value = sc.nextInt();
		Node elem = new Node(value);
		while(true) {
			
			if (current.next==null) {
				current.next = elem;
				break;
			}
			current = current.next;
		}
		display();
	}
	
	public void display() {
		Node curr = head;
		while (curr!=null) {
			System.out.print(curr.data+" --> ");
			curr = curr.next;
		}
		System.out.println("Null");
	}

	
	public static void main(String[] args) {
		Ssl ll = new Ssl();
		ll.head = new Node(10);
		Node second = new Node(11);
		Node third = new Node(12);
		Node fourth = new Node(13);
		 ll.head.next = second;
		 second.next = third;
		 third.next = fourth;
		 while(true) {
			 
			 	System.out.println("Enter the suitable option : ");
				System.out.println("1. Create\n2. Add element");
				Scanner sc = new Scanner(System.in);
				int opt = sc.nextInt();
					
			 
			switch (opt) {
			case 1: {
				ll.create();
				break;
			}
			case 2: {
				ll.add();
				break;
				
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + opt);
			}
		}
		
		
	}

}
