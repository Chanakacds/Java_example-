class A {
	A(boolean i) {
		super();
		System.out.println("False");
	}
	public static void main(String[] args) {
		A a = new A(true);
		System.out.println("After");
	}
}
