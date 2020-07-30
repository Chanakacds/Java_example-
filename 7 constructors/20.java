class A{
	A(){
		this("A");
		System.out.println("no argument constructor of A");
	}
	A(String s){
		super();
		System.out.println("String");
	}
}
class  B extends A{
	B(){
		super();
		System.out.println("no argument constructor of B");
	}
	public static void main(String[] args) {
		B b = new B();
	}
}
