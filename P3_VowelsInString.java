package PracticeInterviewPrograms;

public class P3_VowelsInString {

	public static void main(String[] args) {
		String a="aeioU";
		int count=0;
		
		for(int i=0;i<a.length();i++) {
			int v=a.charAt(i);
			if(v=='a'||v=='e'||v=='i'||v=='o'||v=='u'||v=='A'||v=='E'||v=='I'||v=='O'||v=='U') {
				count++;
			}
		}
		System.out.println(count);

	}

}
