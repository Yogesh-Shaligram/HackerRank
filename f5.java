package InterviewPrograms;

public class f5 {

	public static void main(String[] args) {
		int b=0;
		int f=0;
		int j=0;
		int p=0;
		int v=0;
		
		String ip= "rajasoftwarelabs";
		
		for(int i=0;i<ip.length();i++) {
			if(ip.charAt(i)=='b') {
				b++;
			}
			if(ip.charAt(i)=='f') {
				f++;
			}
			if(ip.charAt(i)=='j') {
				j++;
			}
			if(ip.charAt(i)=='p') {
				p++;
			}
			if(ip.charAt(i)=='v') {
				v++;
			}
		}
		
		System.out.println(b+" "+f+" "+j+" "+p+" "+v);

	}

}
