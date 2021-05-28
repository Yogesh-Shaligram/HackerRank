package InterviewPrograms;

import java.util.Arrays;

public class Smallest2ndNos {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7,10,9,8};
		int temp=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j+1]<a[j]) {
					temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
		
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+" ");
//		}
		
		System.out.println(a[0]+a[1]);
		System.out.println(a[a.length-1]+a[a.length-2]);
	}
}
