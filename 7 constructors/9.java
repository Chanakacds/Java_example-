class A {
	A(int i) {
		super();
		System.out.println(i);
	}
	A(){
		super();
		System.out.println("java");
	}
	public static void main(String[] args) {
		A a = new A(10);
		System.out.println("After");
	}
}

