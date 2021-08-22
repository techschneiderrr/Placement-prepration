import java.util.Scanner;
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
	
	public void addstart() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to be added to start of linkedList : ");
		int value = sc.nextInt();
		Node node = new Node(value);
		node.next = head;
		head = node;
		display();
	}	
	
	
	public void addmiddle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the position in the linkedList : ");
		int pos = sc.nextInt();
		Node temp = head;
		int tem = 0;
		while(temp!=null) {
			tem++;
			temp=temp.next;
		}
		
		if(pos>tem) {
			System.out.println("Enter a valid number ! ");
		}
		else if(pos==1) {
			addstart();
		}
		else {
			System.out.println("Enter the value to be added to the linkedList : ");
			int value = sc.nextInt();
			Node node = new Node(value);
			Node prev = head;
			int count = 1;
			while (count<pos-1) {
				prev = prev.next;
				count++;
			}
			Node current = prev.next;
			prev.next = node;
			node.next = current;
			display();
		}
	}
	
	
	public void display() {
		Node curr = head;
		while (curr!=null) {
			System.out.print(curr.data+" --> ");
			curr = curr.next;
		}
		System.out.println("Null");
		count();
	}

	public int count() {
		Node curr = head;
		int counter = 0;
		while (curr!=null) {
			counter++;
			curr = curr.next;
		}
		System.out.println("There are total "+counter+" elements in the LinkedList.");
		return counter;
	}	
	
	
	public void delstart() {
		if(head==null) System.out.println("empty linked list !");
		Node del = head;
		head = head.next;
		del.next=null;
		System.out.println("deleted element is : "+ del.data);
		display();
	}
	
	public void delend() {
		Node del = head;
		// del is the element before the element to be deleted
		int n = count();
		int count = 1;
		while(count<n-1) {
			del=del.next;
			count++;
		}
		del.next = null;
		display();
	}
	
	public void delmid() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the position to be deleted from the linkedList : ");
		int pos = sc.nextInt();
		int n = count();
		if(pos>n||pos<1) {
			System.out.println("Enter a valid pos !");
		}
		else if(pos==n) {
			delend();
		}
		else if (pos==1) {
			delstart();
		}
		else {
			Node prev = head;    
			Node curr = head.next;
			int count=1;
			while(count<pos-1) {
				prev=prev.next;
				curr=curr.next;
				count++;
			}
			prev.next = curr.next;
			curr.next = null;
		}
		display();
	}
	
	
	public void rev() {
		Node current = head;
		Node prev = null;
		Node next = null;
		while(current!=null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		display();
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
				System.out.println("1. Create\n2. Add element in the end\n3. "
						+ "Add element in the start\n4. Add element in a certain "
						+ "position\n5. count\n6. delete from start\n7. Delete from "
						+ "end\n8. Delete element from mid\n9. Reverse");
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
			case 3: {
				ll.addstart();
				break;
				
			}
			case 4: {
				ll.addmiddle();
				break;
			}
			case 5: {
				ll.count();
				break;
			}
			case 6: {
				ll.delstart();
				break;
			}
			case 7: {
				ll.delend();
				break;
			}
			case 8:{
				ll.delmid();
				break;
			}
			case 9:{
				ll.rev();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + opt);
			}
		}
		
		
	}

}
