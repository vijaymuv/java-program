package com.StaticFinal;

public class Staticdemo {
static int	bonus = 60000;
	public void lastmonth() {
		System.out.println(bonus);
	}
	private void firstmon() {
		bonus = 40000;
System.out.println(bonus);
	}
	private void secondmon() {
		bonus = 30000;
System.out.println(bonus);
	}
	public static void main(String[] args) {
		Staticdemo s = new Staticdemo();
		int bonus1 = bonus;
		System.out.println("final bonus:" +bonus1);
		s.firstmon();
		s.secondmon();
		System.out.println(bonus1);
	}

}
