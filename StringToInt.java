package InterviewPrograms;

public class StringToInt {

	public static void main(String[] args) {
		int a='0';
		String input="123456";
		int[] inte=new int[input.length()];
		
		for(int i=0;i<inte.length;i++) {
			inte[i]=input.charAt(i)-a;
		}
		
		for(int i=0;i<inte.length;i++) {
			System.out.print(inte[i]);
		}

		
		

	}

}
