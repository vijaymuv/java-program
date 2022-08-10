package com.loopsdemo;

public class foreachloopa {
	public static void main(String[] args) {
		int a[] = new int [3];
		a[0]=23;
		a[2]=43;
	
		for(int i:a) {
			System.out.print(i+" ");
		}
		System.out.println();
		int b[] = {1,2,3,4,5,6};
		for (int i : b) {
			System.out.print(i+" ");
		}
	}

}
