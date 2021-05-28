package PracticeInterviewPrograms;

public class P2_ReverseSentenceString {

	public static void main(String[] args) {
		
		String s="the sky is blue";
		String ans="";
		
		int i=s.length()-1;
		
		while(i>=0) {
			
			while(i>=0 && s.charAt(i)==' ') {
				i--;
				
			}
			
			int j=i;
			
			while(i>=0&&s.charAt(j)!=' ') {
				i--;
				
				if(ans.isEmpty()) {
					ans.concat(s.substring(i+1, j+1) );
				}else {
					ans.concat(" "+s.substring(i+1,j+1));
					
				}
				
			}
			
			System.out.print(ans);
		}

	}

}
