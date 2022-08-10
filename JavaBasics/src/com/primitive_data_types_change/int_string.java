package com.primitive_data_types_change;

public class int_string {

	public static void main(String[] args) {
		
		//String to Integer;
		String s = "24";
		Integer v = Integer.valueOf(s);
		System.out.println(v);
		String q = "45";
		int parseInt = Integer.parseInt(q);
		System.out.println(parseInt);
		//Integer to string
int a = 30;
//String i = Integer.toString(a);
String.valueOf(a);
System.out.println(String.valueOf(a));

//double to string
double d = 1.2;
Double dou = Double.valueOf(d);
System.out.println(dou);
//string to double
String e = "23.4";
System.out.println(Double.parseDouble(e));
//boolean to string
boolean b = false;
String t = Boolean.toString(b);
System.out.println(t);

//string to boolean
String x = "fvg";
boolean parseBoolean = Boolean.parseBoolean(x);
System.out.println("string to boolean"+parseBoolean);
//long to string
long l = 234720140934l;
String string = Long.toString(l);
System.out.println(string);
//String to long
String ll = "4564564564256";
System.out.println(Long.valueOf(ll));
//long parseLong = Long.parseLong(ll);
//System.out.println(parseLong);

	}

}
