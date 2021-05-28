package InterviewPrograms;

public class Largest2ndNos {

	public static void main(String[] args) {
		int[] a= {1,5,2,6,9,12,34,65,78,90};
		int temp=0;
		
		for(int i=0;i<=a.length-1;i++) {
			for(int j=i+1;j<=a.length-1;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[1]);

	}

}
