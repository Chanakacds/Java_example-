class A{
}
class  B extends A{
	B(){
		System.out.println("no argument constructor of B");
		super();
	}
	public static void main(String[] args) {
		B b = new B();
	}
}
