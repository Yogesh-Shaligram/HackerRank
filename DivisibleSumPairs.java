package PracticeProgram;

public class DivisibleSumPairs {

	public static void main(String[] args) {
		int a[]= {1,3,2,6,1,2};
		int k=3;
		int count=0;
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i==j) {
					break;
				}
				else{
					sum=a[i]+a[j];
				}
				
				if(sum%k==0) {
					count+=1;
				}

			}
			
		}
		System.out.println(count);

	}

}
