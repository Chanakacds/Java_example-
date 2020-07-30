class A{ 
	int x =12;
	void m(){
		System.out.println("M");
		m1();
	}
	void m1(){
		System.out.println("M1");
	}
	public static void main(String[] args) {
		A a = new A();
		a.m();
	}
}