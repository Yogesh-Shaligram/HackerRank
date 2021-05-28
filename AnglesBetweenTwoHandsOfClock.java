package InterviewPrograms;

public class AnglesBetweenTwoHandsOfClock {

	public static void main(String[] args) {
		int hh=9;
		int mm=00;
		
		double h=((hh*60)+mm)*0.5;
 		double m=mm*6;
 		
 		double angle=abs(h-m);
 		if(angle<360-angle) {
 			System.out.println(angle);
 		}else {
 			System.out.println(360-angle);
 		}
 		
		

	}

	private static double abs(double d) {
		if(d>0) {
			return d;
		}else {
			return -1*d;
		}
		
	}

}
