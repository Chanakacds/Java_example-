class A{
	A a;
	int i;
	void m(A a){
		System.out.println(a.i);
		a= new A();
		a.i=34;
		System.out.println(a.i);
	}
	public static void main(String[] args) {
		A a1 = new A();
		a1.i=10;
		A a2 = new A();
		a2.i=20;
		a1.m(a2);
	}
}
