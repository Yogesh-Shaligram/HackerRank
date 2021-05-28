package Sorting;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int a[]= {5,8,10,45,66,77,89,23,25,65,11,22};
		int key=25;
		int low=0;
		int high=a.length-1;
		int mid=(low+high)/2;
		boolean flag=false;
		
		Arrays.parallelSort(a);
		
		for(int i=0;i<a.length;i++) {
			if(a[mid]>key) {
				high=mid;
			}else if(a[mid]<key) {
				low=mid;
			}else {
				flag=true;
				System.out.println("Found");
			}
		}

	}

}
