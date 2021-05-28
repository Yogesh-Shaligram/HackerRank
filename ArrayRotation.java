package PracticeProgram;

public class ArrayRotation {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int r=6;
		int temp=0;
		
		while(r!=0) {
			temp=a[0];
			
			for(int j=0;j<a.length-1;j++) {
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
		
		
		r--;
		}
		for(int i=0;i<=a.length-1;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
