package DataStructure;

public class Linked_List_Created {

	public static void main(String[] args) {
		Linkedl sll = new Linkedl(); 
		
		sll.toAdd(1);
		sll.toAdd(2);
		sll.toAdd(3);
		
		
		
		sll.toPrint();
		
		sll.toRemove();
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		sll.toPrint();
		sll.toRemove();
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		sll.toPrint();

	}
	
	

}

class Linkedl{
	
	static Node head;
	
	
	public static void toAdd(int data) {
		Node add = new Node(data);
		Node temp = head;
		
		if(head==null) {					//First node
			head=add;
			return;
		}
		
		while(temp.next !=null) {			//to find last node
			temp=temp.next;
		}
		temp.next=add;						// New node added here
		 
		
	}
	
	public static void toRemove() {
		
		Node temp=head;
		while(temp.next.next !=null) {			//to find last node
			temp=temp.next;
		}
		temp.next=null;
	}
	
	public static void toPrint() {
		Node temp = head;
		
		while(temp !=null) {			//to find last node
			System.out.println(temp.data+" ");
			
			temp=temp.next;
		}
		
	}
	
	static class Node{				//For creating Node
		int data;
		Node next;
		
		public Node(int data){
			this.data=data;
			next=null;
		}
	}
		
}



