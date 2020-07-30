class A{ 
	int x =12;
	void m(){
		int x =40;
		System.out.println(A.x);
	}
	public static void main(String[] args) {
		A a = new A();
		a.m();
	}
}