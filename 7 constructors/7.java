class A {
	A(int i,String s){
		super();
		System.out.println(i);
		System.out.println (s);
	}
	public static void main(String[] args) {
		A a = new A(10,"abc");
		System.out.println("After");
	}
}
