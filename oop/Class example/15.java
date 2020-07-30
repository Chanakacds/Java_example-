class A {
	A(){
		super();
		System.out.println("A class constructor");
	}
}
class Test extends A{
	Test(){
		super();
		System.out.println("Test class constructor");
	}
	public static void main(String[] args){
		new Test();
	}
}




