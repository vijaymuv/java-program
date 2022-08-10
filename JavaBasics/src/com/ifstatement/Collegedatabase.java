package com.ifstatement;

public class Collegedatabase {
	public static String rollno="1121";
	public static String dob="10102010";
	public static String email="amet@gmail.com";
	public static String mobileno="9988776655";
	public static String OptionA= "speech";
	public static String OptionB="dance";
	public static String OptionC="drawing";
	public static String eventTime= "Monday(01-02-22) Morning 9:30"; 
	public static void main(String[] args) {

		if(rollno == "1120" && dob == "10102010") {
			System.out.println("Welcome to our event");
			if(email == "amet2022@gmail.com" && mobileno == "9988776655") {
				System.out.println("Emaild is valid");
			}else if(email =="amet@gmail.com") {
				System.out.println("Email is valid");
			}
			else {
				System.out.println("Invalid credentials");
			}
			
		}
		if(rollno == "1121" && dob == "10102010"){
			
			System.out.println("Welcome to our event");
			System.out.println();
			if(email == "amet2022@gmail.com" && mobileno ==" 9988776655") {
				System.out.println("Invalid details");
			}else if(email =="amet@gmail.com"&& mobileno =="9988776655") {
				System.out.println("Email and moblie no is updated");
			}
			else {
				System.out.println("Invalid credentials");
			}
		}
		System.out.println();
		System.out.println("Please select any one of the below options whether speech,dance,drawing");
		
		if(OptionA ==" speech" || OptionB=="dance" || OptionC=="drawing") {
			System.out.println("Your speech is scheduled , please be prepared and all the best");
		System.out.println("EventTime will be " +eventTime);
		}else { 
				System.out.println("Invalid credintials");
						}
		System.out.println();
		System.out.println("Thankyou for participating");
			}
		}
		


