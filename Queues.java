package DataStructure;

import java.util.*;

public class Queues {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>();
		
		q.add(1);
		q.add(2);
		q.add(3);
		
		System.out.println(q);
		
		q.remove();
		q.remove();
		
		System.out.println(q);
		
		q.poll();
		System.out.println(q);
		

	}

}
