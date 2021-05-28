package InterviewPrograms;

public class ReverseSLL {

	public static void main(String[] args) {
		
		add(1);
		add(2);
		add(3);
		add(4);
		add(5);
		add(6);
		
		print();
		reverse();

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
		}
		
	}
	
	public static void print() {
		Node temp=head;
		if(head==null) {
			System.out.println("Empty");
		}else {
			System.out.print(temp.data+" ");
			while(temp.next!=null) {
				temp=temp.next;
				System.out.print(temp.data+" ");
			}
		}
	}
	
	public static void reverse() {
		Node current =head;
		Node previous=null;
		Node next=null;
		while(current!=null) {
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		Node temp=previous;
		if(head==null) {
			System.out.println("Empty");
		}else {
			System.out.println();
			System.out.print(temp.data+" ");
			while(temp.next!=null) {
				temp=temp.next;
				System.out.print(temp.data+" ");
			}
		}
	}

}


class Node{
	Node next;
	int data;
	Node(int data){
		this.data=data;
		next=null;
	}
}
