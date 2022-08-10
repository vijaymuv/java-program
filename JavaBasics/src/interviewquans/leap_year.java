package interviewquans;

public class leap_year {
	public static void main(String[] args) {
		for (int i = 2000; i <=2030; i++) {
			if(( i%400 == 0)|| (( i%4 == 0 ) &&( i%100 != 0))) {
				System.out.println("is leap year :"+i);
			}else {
				System.out.println("is not leap year:"+i);
			}
		}
		int sumodd =0;
		int sumeven=0;
		for (int i = 366; i <=396; i++) {
			if(i%2==0) {
				sumeven = sumeven+i;
			}
			else {
				sumodd=sumodd+i;
			}
			
		}
		System.out.println("sum of odd: "+sumodd);
		System.out.println("sum of even:"+sumeven);
		
	}

}
