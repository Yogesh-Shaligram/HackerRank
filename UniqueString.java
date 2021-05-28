package InterviewPrograms;

public class UniqueString {

	public static void main(String[] args) {
		String a="abcdefa";
		int count=0;
		boolean isunique=true;
		
		for(int i=0;i<a.length()-1;i++) {
			for(int j=i+1;j<a.length()-1;j++) {
				if(a.charAt(i)==a.charAt(j)) {
					isunique=false;
					count++;
					break;
				}
			}
		}
		
		if(isunique==false&&count<a.length()) {
			System.out.println("Not Unique");
		}else {
			System.out.println("Unique");
		}

	}

}
