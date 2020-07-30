class Test {
	static {
		System.out.println(x);
		System.out.println(Test.x);
	}
	static int x = 10;
	public static void main(String[] args){
		System.out.println("main method");
	}
}

