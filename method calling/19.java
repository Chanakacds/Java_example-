class A{
	A a;
	int i;
	public static void main(String[] args) {
		A a1 = new A();
		a1.i=10;
		A a2= new A();
		a2.i=20;
		A a3= new A();
		a3.i=30;
		a1.a=a2;
		a2.a=a3;
		a3.a=a1;
		System.out.println(a1.a.i);
		System.out.println(a1.a.a.i);
		System.out.println(a1.a.a.a.i);
	}
}
