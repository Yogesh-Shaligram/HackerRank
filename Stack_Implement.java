package DataStructure;
import java.util.*;

public class Stack_Implement {

	public static void main(String[] args) {
		Stack1 s = new Stack1();
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		
		s.peek();
		s.print();
		
		
		
		
	}
}

class Stack1{
	
	static Node head;
	
void push(int data) {
	Node push = new Node(data);
	Node temp = head;
	
	if(head==null) {
		head=push;
		return;
	}
	
	while(temp.next !=null) {
		temp=temp.next;
	}
	temp.next=push;
		
		
	}
	
	void pop() throws Exception {
		
		Node temp= head;
		if(temp==null) {
			throw new Exception("Error Empty Stack!");
		}
		
		if(temp.next==null) {
			head=null; 
		}
		
		while(temp.next.next !=null) {
			temp=temp.next;
		}
		
		if(temp==head) {
			head.next=null;
		}
		
		temp.next=null;
		
	}
	
	void peek() {
		Node temp = head;
		while(temp.next !=null) {
			temp=temp.next;
		}
		System.out.println(temp.data+" ");
		
		
	}
	
	void print() {
		Node temp = head;
		
		while(temp !=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
		
	}
	
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			next=null;
		}
	}
}
