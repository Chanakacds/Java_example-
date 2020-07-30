class Test {
	static int x = 10;
	static {
		System.out.println("static block");
		System.out.println(x);
	}
	public static void main(String[] args){
		System.out.println("main method");
	}
}


