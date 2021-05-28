package PracticeInterviewPrograms;

public class P8_Palindrome {

	public static void main(String[] args) {
		String a="civica";
		String b="";
		int count=0;
		
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
		}
		
		for(int i=0;i<b.length();i++) {
			if(a.charAt(i)==b.charAt(i)) {
				count++;
			}
		}
		
		if(count==a.length()) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}

	}

}
