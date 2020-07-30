class A
{
	void m(int i){
		System.out.println(i);
	}
	public static void main(String args[]){
		A a = new A();
		a.m(10++);
	}
} 
