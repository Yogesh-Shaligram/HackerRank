package InterviewPrograms;

import java.util.Arrays;

public class Final2 {

	public static void main(String[] args) {
		
		int arr[]={14, 12, 70, 15, 95, 65, 22, 30};
		int a[]=new int[arr.length];
		
		int secondMax=0;
		
		Arrays.parallelSort(arr);
		
		secondMax=arr[arr.length-1]-arr[1];
		System.out.println(secondMax);

	}

}
