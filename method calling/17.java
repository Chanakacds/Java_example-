class A{
	int i;
	public static void main(String args[]){
		A a = new A();
		A a1 = new A();
		a.i=10;
		a1.i =20;
		System.out.println(a.i);
		System.out.println(a1.i);
		a= a1;
		System.out.println(a.i);
		System.out.println(a1.i);
	}
}
