class Test {
	static {
		System.out.println("static block");
		m1();
	}
	public static void m1(){
		System.out.println(x);
	}
	static int x = 10;
	public static void main(String[] args){
		System.out.println("main method");
		System.out.println(x);
	}
}


