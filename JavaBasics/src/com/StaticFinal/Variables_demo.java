package com.StaticFinal;

public class Variables_demo {
	int b;
	public void S1() {
int b = 20;
System.out.println(b);
	}
	public void s2() {
System.out.println(b);
	}
	public void s3() {
		b=50;
System.out.println(b);
	}public void s4() {
		int b = 40;
System.out.println(b);
	}
	public void s5() {
System.out.println(b);
	}
public static void main(String[] args) {
	Variables_demo d = new Variables_demo();
	d.s2();
	d.S1();
	d.s4();
	d.s5();
	d.s3();
	System.out.println("variable:"+d.b);
}
}
