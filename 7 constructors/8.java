class A {
	A(int i,String s,int i1,String st,String p){
		super();
		System.out.println(i);
		System.out.println (s);
		System.out.println(i1);
		System.out.println(st);
		System.out.println(p);
	}
	public static void main(String[] args) {
		A a = new A(10,"java",23,"","class");
		System.out.println("After");
	}
}
