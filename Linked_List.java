package DataStructure;

import java.util.*;

public class Linked_List {

	public static void main(String[] args) {
		
		List<Integer> ll= new LinkedList<>();
		
		ll.add(21);
		ll.add(2);
		ll.add(33);
		
		System.out.println(ll);
		
		ll.remove(2);
		
		System.out.println(ll);
		
		System.out.println(ll.get(1));
		
		ll.set(0, 44);
		
		System.out.println(ll);
		
		System.out.println("Size-"+ll.size());
		
		System.out.println(ll.contains(2));
		
		System.out.println(ll.isEmpty());
		
//////////////////////////////////////////////////////////////
		
		List<Integer> ll1 = new LinkedList<>();
		List<Integer> al1 = new ArrayList<>();

		gettime(ll1);
		gettime(al1);
	}

	private static void gettime(List<Integer> list) {
		
		long start=System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			list.add(0,i);
		}
		long end=System.currentTimeMillis();
		
		System.out.println(list.getClass().getName()+" --> "+ (end - start));
		
		
		
	}

}
