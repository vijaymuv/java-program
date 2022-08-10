package com.breakandcontinue;

import java.util.Scanner;

public class breakcontinu {
	public static int startno, endingno, exceptno1, exceptno2;
	public static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter starting no:");
		startno = s.nextInt();
		System.out.println("enter ending no:");
		endingno = s.nextInt();
		System.out.println("enter exceptno1:");
		exceptno1 = s.nextInt();
		System.out.println("enter exceptno2:");
		exceptno2 = s.nextInt();
		for (int i = startno; i <= endingno; i++) {
			if (i == exceptno1) {
				continue;
			} else if (i == exceptno2) {
				continue;
			} else {
				System.out.println(i);
			}
		}
	}
}
