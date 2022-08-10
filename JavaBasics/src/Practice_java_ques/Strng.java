package Practice_java_ques;

import java.util.Scanner;

import com.StaticFinal.Finaldemo;

public class Strng {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string:");
		String abc =sc.nextLine();
		System.out.println("language:"+abc);
		System.out.println("enter a name:");
		String name =sc.next();
		System.out.println("name:"+name);
		Finaldemo d = new Finaldemo();
		d.lastmonth();
		sc.close();
	}
}
