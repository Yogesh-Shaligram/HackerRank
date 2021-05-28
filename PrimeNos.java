package Revision;

public class PrimeNos {

	public static void main(String[] args) {
		
		int n=5;
		int x=2;
		int count=0;
		boolean prime;
		
		while(count!=n) {
			prime=true;
			
			for(int i=2;i<=Math.sqrt(x);i++) {
				if(x%i==0) {
					prime=false;
					break;
				}
			}
			
			if(prime) {
				count++;
				System.out.print(x+" ");
			}
			x++;
		}
		
	}

}
