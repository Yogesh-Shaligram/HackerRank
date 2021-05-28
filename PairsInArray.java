package PracticeProgram;

public class PairsInArray {

	public static void main(String[] args) {
		
		int a[]= {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					break;
				}else {
//					j++;
//					j++;
				}
			}
		}
		
		System.out.print(" "+count);

	}

}
