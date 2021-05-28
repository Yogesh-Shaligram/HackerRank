package PracticeInterviewPrograms;

public class P13_ArmstrongNos {

	public static void main(String[] args) {
		int n=153;
		int t1=n;
		int t2=n;
		int l =0;
		int rem=0;
		int arm=0;
		
		while(t1!=0) {
			t1=t1/10;
			l=l+1;
		}
		
		
		while(t2!=0) { 
			int mul=1;
			rem=t2%10;
			for(int i=1;i<=l;i++) {
				mul=mul*rem;
			}
			arm=arm+mul;
			t2=t2/10;
		}
		
			
		if(arm==n) {
			System.out.println("Armstrong");
		}else {
			System.out.println("Not Armstrong");
		}

	}

}
