package PracticeInterviewPrograms;

public class P10_2ndLargestNos {

	public static void main(String[] args) {
		int[] a= {4,6,7,9,1,2,6};
		int temp=0;
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length-1;i++) {
			System.out.print(a[i]+" ");
			
		}
		System.out.println(a[1]);
		
		

	}

}
