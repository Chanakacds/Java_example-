class A{
	A(byte i){
		super();
		System.out.println(i);
	}
	public static void main(String[]args){
		A a = new A((byte)10);
		System.out.println("After");
	}
}
