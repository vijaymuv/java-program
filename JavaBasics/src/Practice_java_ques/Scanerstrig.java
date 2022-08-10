package Practice_java_ques;

import java.util.Scanner;

public class Scanerstrig {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter your age:");
		byte age = s.nextByte();
		System.out.println("your age:"+age);
		System.out.println("enter your dob year:");
		short year = s.nextShort();
		System.out.println("your year:"+year);
		System.out.println("enter your phoneno:");
		int phno = s.nextInt();
		System.out.println("your phoneno:"+phno);
		System.out.println("enter your accont no:");
		long accno = s.nextLong();
		System.out.println("your accno:"+accno);
		System.out.println("enter your salary in decimal:");
		float salary = s.nextFloat();
		System.out.println("your salary:"+salary);
		System.out.println("enter your annual salary in decimal :");
		double yearsalary = s.nextDouble();
		System.out.println("your annual salary in decimal :"+yearsalary);
		System.out.println("are you a boy?");
		boolean value = s.nextBoolean();
		System.out.println("boolean:"+value);
		s.close();
		
	}
	
	

}
