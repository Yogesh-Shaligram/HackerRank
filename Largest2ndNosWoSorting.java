package InterviewPrograms;

public class Largest2ndNosWoSorting {

		public static void main(String[] args) {
			
			int f=0;
			int s=0;
			
			int[] a= {1,2,3,4,5,6,7,8,9,10};
			
			for(int i=0;i<a.length;i++) {
				if(f<a[i]) {
					s=f;
					f=a[i];
				}else {
					if(s<a[i]&&f!=a[i]) {
						s=a[i];
					}
				}
			}
			System.out.println(s);
		}

}
