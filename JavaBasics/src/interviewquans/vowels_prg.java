package interviewquans;


public class vowels_prg {

	public static void main(String[] args) {

		String s = "mitchel stark";
char[] ch = s.toCharArray();
for (int i = 0; i < ch.length; i++) {
	if (ch[i]=='a'|| ch[i]=='e' || ch[i]=='i'  || ch[i]=='o' || ch[i]=='u')  {
		
		ch[i]='*';
		
	}
	System.out.println(ch[i]);
	
}
					
	}
}
