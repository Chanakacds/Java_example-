class A{
	static int i;
	void m(int x){
		i++;
		System.out.println(i);
	}
	public static void main(String args[]){
		A a = new A();
		a.m(++i);
		System.out.println(i);
	}
}
