class A{
}
class  B extends A{
	B(){ 
		super("A");
		System.out.println("no argument constructor of B");
	}
	public static void main(String[] args) {
		B b = new B();
	}
}
