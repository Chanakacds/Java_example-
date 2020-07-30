class A{
	int i =10;
	public static void main(String[] args) {
		A a = new A();
		A a1= new A();
		a1.i=12;
		System.out.println(a.i);
		System.out.println(a1.i);
	}   
}
