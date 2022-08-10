package Practice_java_ques;

public class variablesanddatatypes {
	int age = 10;
	private int b = 20;
	public int c= 30;
	protected int d = 40;
	static int aa = 100;
	public static int bb  =200;
protected static int cc = 300;
private static int dd = 400;
final static int aaa = 1000;
public final static int bbb= 2000;
private final static int ccc=3000;
protected final static int ddd = 4000;
 public static void run() {
System.out.println("run");
}
public static void main(String[] args) {
	variablesanddatatypes d = new variablesanddatatypes();
	System.out.println(d.age);
	System.out.println(d.b);
	System.out.println(d.c);
	System.out.println(d.d);
	System.out.println(aa);
	System.out.println(bb);
	System.out.println(cc);
	System.out.println(dd);
	System.out.println(aaa);
	System.out.println(bbb);
	System.out.println(ccc);
	System.out.println(ddd);
	System.out.println(variablesanddatatypes.aa);
}	

}
