package DataStructure;

public class DoublyLinkedList {

	public static void main(String[] args) {
		
		add(1);
		add(2);
		add(3);
		add(4);
		add(5);
		add(6);
		
		reverse();

		print();
		

	}
	
	static Node head;
	
	public static void add(int data) {
		
		Node temp=head;
		Node add=new Node(data);
		
		if(head==null) {
			head=add;
		}else {
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=add;
			add.prev=temp;
		}
	}
	public static void print() {
		Node temp = head;
		
		while(temp !=null) {			//to find last node
			System.out.print(temp.data+" ");
			
			temp=temp.next;
		}
		
	}
	
	public static void reverse() {
		Node temp=head;
		
		while(temp!=null) {
			temp=temp.next;
		}
		temp=temp.prev;
		System.out.println(temp.data);
	}

}

class Node{
	Node next;
	Node prev;
	int data;
	
	Node(int data){
		this.data=data;
		next=null;
		prev=null;
	}
}
