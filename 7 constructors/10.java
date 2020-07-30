class A {
	A(int i) {
		super();
		System.out.println(i);
	}
	A(){
		super();
		System.out.println("Constracter 02");
	}
	public static void main(String[] args) {
		A a = new A(10);
		A a1 = new A();
		System.out.println("After");
	}
}
