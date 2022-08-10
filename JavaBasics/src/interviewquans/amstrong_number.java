package interviewquans;

public class amstrong_number {
	public static void main(String[] args) {
		int a = 153;
		int num =a;
		int value=0;
		int rem = 0;
		while (num>0) {
			rem = num%10;
			value = value+(rem*rem*rem);
			num=num/10;
			
		}
		if (value==a) {
			System.out.println("armstrong no");
			
		}else {
			System.out.println("is not armstrong no");
		}
	}

}
