class Test {
	Test(){
		System.out.println("constructor");
	}
	{
		System.out.println("instance block");
	}
	static {
		System.out.println("static block");
		m1();
		Test t = new Test();
	}
	public static void m1(){
		System.out.println(x);
	}
	static int x = 10;
	public static void main(String[] args){
		System.out.println("main method");
		System.out.println(x);
		Test t = new Test();
	}
	static Test t = new Test();
}


