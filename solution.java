class Test {
	public static int v1;
	public static int v2;
	public static int ans;
	public static void get_val() {
		v1 = 20;
		v2 = 30;
	}
	public static void cal_val() {
		ans = v1 + v2;
	}
	public static void display() {
		System.out.println(ans);
	}
}
class solution {
	public static void main(String[]args) {
		Test.get_val();
		Test.cal_val();
		Test.display();
	}
}