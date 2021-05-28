package InterviewPrograms;

public class StrongNumber {

	public static void main(String[] args) {
		
		int n=145;
		int rem=0;
		int sum=0;
		
		int t1=n;
		int l=0;
		while(t1!=0) {
			rem=t1%10;
			int fact=1;
			for(int i=1;i<=rem;i++) {
				fact*=i;
			}
			t1=t1/10;
			sum+=fact;
			//System.out.println(sum);
		}
		
		if(sum==n) {
			System.out.println("Strong");
		}else {
			System.out.println("Not strong");
		}
		
		

	}

}
