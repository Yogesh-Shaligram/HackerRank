package InterviewPrograms;

public class ReverseString {

	public static void main(String[] args) {
		String a ="Hello";
		String rev="";
		
		int s= a.length();
		
		for(int i=s-1;i>=0;i--) {
			rev=rev+a.charAt(i);
		}
		
		System.out.println(rev);
	

	}

}
