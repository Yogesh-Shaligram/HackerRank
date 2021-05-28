package com.company;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int r[]={2,4,6,9,12,8};
		int n=r.length;
		
		int max=r[0];
		for(int i=0;i<r.length;i++) {
			if(r[i]>max) {
				max=r[i];
			}
		}
		
		System.out.println(max);
	}
}
