package PracticeInterviewPrograms;

public class P4_First5PrimeNos {

	public static void main(String[] args) {
		int n=5;
		int count=0;
		int num=2;
		
		
		while(count!=n) {
			boolean prime=true;
			for(int i=2;i<=Math.sqrt(num);i++) {
				if(num%i==0) {
					prime=false;
					break;
				}
			}
			if(prime) {
				count++;
				System.out.print(num+" ");
			}
			num++;
		}

	}

}
