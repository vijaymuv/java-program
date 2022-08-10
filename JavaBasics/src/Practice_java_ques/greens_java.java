package Practice_java_ques;

import java.util.Scanner;

public class greens_java {


		public static void main(String[] args) {
			String s = "java abcdefghijklmniopqrstuvwxyz";
			String[] a = s.split("");
			
			for (String b : a) {
			
				if (b.equalsIgnoreCase("a") ||b.equalsIgnoreCase("e") || b.equalsIgnoreCase("i") || b.equalsIgnoreCase("o") || b.equalsIgnoreCase("u")) {
continue;
				}else {
					System.out.println(b);
				}
				
			}
			
		}
			} 
		
