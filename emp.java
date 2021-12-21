class obj {
	public static int n = 0;
	public obj() {
		n++;
	}
}
class emp {
	public static void main(String[] args) {
		obj o1 = new obj();
		obj o2 = new obj();
		obj o3 = new obj();
		System.out.println("the no of objects are" + obj.n);
	}
}