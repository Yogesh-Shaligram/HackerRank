package InterviewPrograms;

public class Palindrome {

	public static void main(String[] args) {
		
		String original="civic";
		String rev="";
		int l=original.length();
		int count=0;
		
		for(int i=l-1;i>=0;i--) {
			rev=rev+original.charAt(i);
		}
		
		for(int i=0;i<=l-1;i++) {
			if(original.charAt(i)==rev.charAt(i)) {
				count++;
			}
		}
		
		if(count==l) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
		

	}

}
