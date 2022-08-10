package com.loopsdemo;

public class Staticdemo {
	int a = 1;
	public int b = 4;
	private int c  =2;
	protected int d = 3;
	static int aa=11;
	public static int bb = 22;
	protected static int cc = 33;
	private int dd = 44;
	final int aaa = 111;
	public final static int bbb = 222;
	protected final static int ccc = 333;
	
	public static int age() {
int ab = 25;
return ab;
}
	public static void main(String[] args) {
		Staticdemo s = new Staticdemo(); 
		System.out.println(aa);
		System.out.println(s.a);
	System.out.println(age());
	int age2 = age();
	System.out.println(age2);
	System.out.println(s.b);
	System.out.println(s.c);
	System.out.println(s.dd);
		
	}

}
