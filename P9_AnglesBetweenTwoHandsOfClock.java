package PracticeInterviewPrograms;

public class P9_AnglesBetweenTwoHandsOfClock {

	public static void main(String[] args) {
		int hh=9;
		int mm=0;
		
		double h=((hh*60)+mm)*0.5;
		double m=mm*6;
		
		double angle=abs(h-m);
		if(angle<360-angle) {
			System.out.println(angle);
		}else {
			System.out.println(360-angle);
		}
		
		
	}
	
	public static double abs(double angle) {
		if(angle>0) {
			return angle;
		}else {
			return -1*angle;
		}
	}

}
