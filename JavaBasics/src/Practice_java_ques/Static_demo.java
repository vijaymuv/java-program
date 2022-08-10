package Practice_java_ques;

public class Static_demo  {
	public static int age = 30;
	public static void Bikename (String name) {
		System.out.println("bike:"+name);
	}
	public static void main(String[] args) {
		int age1 = age;
		System.out.println(age1);
		System.out.println(Static_demo.age);
		Static_demo.Bikename("pulsar");
		variablesanddatatypes.run();
	}
}
