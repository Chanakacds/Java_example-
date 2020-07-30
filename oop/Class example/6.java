class Test {
	static {
		System.out.println("static block");
		System.out.println(x);
	}
	static int x = 10; // x=0 RIWO
	public static void main(String[] args){
		System.out.println("main method");
	}
}


