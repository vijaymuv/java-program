package com.exeptions;


public class exception_handling_demo {
	public static void main(String[] awwrgs) throws InterruptedException {
		int a = 3;
		System.out.println(a);
		try {
			System.out.println(a/0);
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("null exception");
		}
		catch(Exception e){
			//e.printStackTrace();
			System.out.println("exception handled");
		}
		finally {
			//System.exit(0);
			System.out.println(a+1);
		}
		System.out.println("completed");
		
		
}
	}
