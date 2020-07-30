class A{ 
	static int i=40;
	int x;
	void m(){
		int i = 20;
		i=50;
		x = 30;
		A.i = 100;
		System.out.println(x);
	}
	public static void main(String[] args) {
		A a = new A();
		System.out.println(i);
		a.m();
		System.out.println(i);
	}
}




