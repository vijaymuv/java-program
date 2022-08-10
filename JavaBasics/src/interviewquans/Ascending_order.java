package interviewquans;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ascending_order {
public static int temp;

private void listto_ascending() {
	List<Integer> l = new ArrayList<Integer>();
	l.add(1);
	l.add(3);
	l.add(5);
	l.add(2);
	Collections.sort(l);
System.out.println(l);
}
	public static void main(String[] args) {
int a[]= {11,15,12,14,13};
for (int i = 0; i < a.length; i++) {
	for (int j = i+1; j < a.length; j++) {
		
		if (a[i]>a[j]) {
			
			temp = a[i];
			a[i]=a[j];
			a[j]=temp;
			
		}
	}
	
}
for (int i = 0; i < a.length; i++) {
	System.out.println(a[i]);
}
	
	}

}
