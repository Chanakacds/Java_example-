class A{
	static int i;
	void m1(int i){
		System.out.println(i);
	}
	void m(int x){
		i++;
		System.out.println(i);
		A a = new A();
		a.m1(x);
	}
	public static void main(String args[]){
		A a = new A();
		a.m(20);
		System.out.println(i);
	}
}
