package Revision;

public class LinkedListCreated {

	public static void main(String[] args) {
		create(1);
		create(2);
		create(3);
		create(4);
		
		print();

	}
	
	static Node head;
	
	public static void create(int data) {
		
		Node add= new Node(data);
		Node temp=head;
		
		if(head==null) {
			head=add;
			return;
			
		}else {
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=add;
			
		}
		
		
		
		
	}
	
	public static void print() {
		
		Node temp=head;
		
		while(temp.next!=null) {
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
		
		
	}
	

}

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		next=null;
	}
}
