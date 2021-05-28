package PracticeProgram;

import java.util.*;

public class BirthdayChocolateDistribution {

	public static void main(String[] args) {
		
		List<Integer> s = new ArrayList<>();
		
		s.add(1);
		s.add(2);
		s.add(1);
		s.add(3);
		s.add(2);
		int d=0;
		int m=0;
		int answer=0;
        int temp=0;
        for(int i=0;i<=s.size()-m;i++){
            for(int t=i;t<i+m;t++){
                temp+=s.get(t);
            }
            if(temp==d)
            {
                answer++;
            }
            temp=0;
        }
        System.out.println(answer);
	
	}

}
