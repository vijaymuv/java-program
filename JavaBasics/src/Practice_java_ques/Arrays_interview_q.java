package Practice_java_ques;


public class Arrays_interview_q {
	

	public static void main(String[] args) {
		int []a= {10,20,10,100};
		for (int i = 0; i < a.length; i++) {
			if (a[i]==10) {
				a[i]=100;
			}
			System.out.println(a[i]);
		}
		}
}
