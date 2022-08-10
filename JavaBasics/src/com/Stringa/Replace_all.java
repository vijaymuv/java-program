package com.Stringa;

public class Replace_all{

public static void main(String[] args) {
	String a = "  welcome to string22@# array&053=3   ";
String replaceAll = a.replaceAll("[^a-zA-Z]", " ");
System.out.println(replaceAll);
System.out.println(replaceAll.trim());

}
}
