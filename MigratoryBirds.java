package PracticeProgram;

public class MigratoryBirds {

	public static void main(String[] args) {
		int a[]= {1,2,1,3};
		int number[]=new int[a.length];
		int freq[]=new int[a.length];
		int count=0;
		for(int i=0;i<freq.length;i++) {
			freq[i]=1;
		}
		
		for(int i=0;i<a.length;i++) {
			//System.out.print(i);
			for(int j=i;j<a.length;j++) {
				//System.out.print(j);
				if(a[i]==a[j]) {
					System.out.print(i);
					continue;	
				}
				else {
					continue;
				}
				}
			}
		//System.out.println(count);
		
	}

}
