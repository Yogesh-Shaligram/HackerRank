package PracticeInterviewPrograms;

public class P5_DivisionWithoutSign {

	public static void main(String[] args) {
		
		int a=10000;
		int b=5;
		int c=0;
		int ans=0;
		c=a+b;
		
		while(c>b) {
			c=c-b;
			ans++;
		}
		
		System.out.println(ans);

	}

}
