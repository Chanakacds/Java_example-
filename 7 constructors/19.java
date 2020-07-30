class A{
	A(){
		this("A");
		System.out.println("no argument constructor");
	}
	A(String s){
		System.out.println("String");
	}
	public static void main(String[] args){
		A a = new A();
	}
}
