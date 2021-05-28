package InterviewPrograms;

public class DivisionWithoutSign {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		int c=0;
		int result=0;
		c=a+b;			//c=15
		
		while(c>b) {
			c=c-b;
			result++;
		}
		
		System.out.println(result);

	}

}
