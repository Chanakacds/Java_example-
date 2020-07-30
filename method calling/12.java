class A{
	static int i;
	void m(int i){
		i++;
		System.out.println(i);
	}
	public static void main(String args[]){
		A a = new A();
		a.m(++i);
		System.out.println(i);
	}
}
