package DataStructure;

public class Queue_Implement {

	public static void main(String[] args) {
		
		Que q = new Que();
		q.enque(1);
		q.enque(2);
		q.enque(3);
		
		q.print();
		

	}
	


}

class Que{
	
	static Node head;
	
	public static void enque(int data) {
		
		Node newNode = new Node(data);
		Node temp=head;
		
		if(head==null) {
			
		}
		else {
			while(temp.next==null) {
				temp=temp.next;
			}
			
			temp.next=newNode;
		}
	}
	
	
	public static void print() {
		Node temp=head;
		System.out.println(temp.data);
	}
	
	
	
	
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	
}
