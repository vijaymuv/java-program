package interviewquans;

public class reversestring {
public static void main(String[] args) {
	StringBuffer s = new StringBuffer("dad");
	s.reverse();
	System.out.println("After reverse:"+s);
	String a = "dad";
	String reverse = "";
	
	for (int i = a.length()-1; i>=0; i--) {
		reverse = reverse+a.charAt(i);
	}
	System.out.println(reverse);
	if(a.equals(reverse)) {
		System.out.println("is palindrome");
	}
	else {
		System.out.println("is not palindrome");
	}
	a.substring(1);
	System.out.println(a.substring(1));
	
}
}
