class A{ 
	static int x=40;
	void m(int i){
		x = i;
	}
	public static void main(String[] args) {
		A a = new A();
		System.out.println(x);
		a.m(12);
		System.out.println(x);
	}
}