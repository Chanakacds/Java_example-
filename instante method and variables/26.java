class A{ 
	int x =12;
	void m(){
		int x = 40;
		System.out.println(x);
		System.out.println(this.x);
	}
	public static void main(String[] args){
		A a = new A();
		a.m();
	}
}


