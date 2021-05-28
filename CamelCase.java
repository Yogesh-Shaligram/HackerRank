package PracticeProgram;

public class CamelCase {

	public static void main(String[] args) {
		
		String s="saveChangesInTheEditor";
		int c=1;
		
		
		int len=s.length();
		
		for(int i=0;i<len-1;i++) {
			int as=(int) s.charAt(i);
			if(as>65 && as<90) {
				c++;
			}
		}
		System.out.println(c);
		

	}

}
