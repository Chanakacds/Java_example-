class A{
	void m(byte i)
	{
		System.out.println(i);
	}
	public static void main(String args[])
	{
		A a = new A();
		a.m((byte)10);
	}
} 
