package interviewquans;

public class even_odd {
	
		public void vbike() {
		System.out.println("all");	// TODO Auto-generated method stub

		}
	public static void main(String[] args) {
		for (int i = 1; i <=10; i++) {
			if(i%2!=0) {
				System.out.println("is odd : " +i);	
			}
			else {
				System.out.println("is  even: " +i);
			}
		}
		System.out.println(10+30+"vijay");
		System.out.println("vijay"+10+30);
		int sumeven=0;
		int sumodd=0;
		for (int i = 1; i <=10; i++) {
			if(i%2==0) {
				sumeven=sumeven+i;
			}
			else if(i%2!=0) {
				sumodd=sumodd+i;
			}
		}
		System.out.println("sum even : " +sumeven);	
		System.out.println("sum odd : " +sumodd);
		int factorial = 1;
for (int i = 5; i>=1; i--) {
	factorial = factorial*i;
}
System.out.println("factorial is: "+factorial);

	}
}
