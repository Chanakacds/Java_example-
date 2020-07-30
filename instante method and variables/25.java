class A{ 
	int x =12;
	void m(){
		System.out.println(x);
		A a = new A();
		System.out.println(a.x);
	}
	public static void main(String[] args) {
		A a = new A();
		a.x =40;
		System.out.println(a.x);
		a.m();
		System.out.println(a.x);
	}
}