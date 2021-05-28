package PracticeProgram;

public class BonAppétit {

	public static void main(String[] args) {
		int a[]= {3,10,2,9};
		int k=1;
		int b=7;
		
		int sum=0;
		int sum2=0;
		int diff=0;
		
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
			
		}
		sum2=sum/2;
		//System.out.println(sum2);
		
		diff=sum-a[k];
		
		int ans=diff/2;
		
		//System.out.println(ans);
		
		if(ans==b) {
			System.out.println("Bon Appétit");
		}
		else {
			System.out.println(sum2-ans);
		}
		
		

	}

}
