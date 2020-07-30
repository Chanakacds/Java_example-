class Test {
	{
		m();
	}
	void m(){
		System.out.println(x);
	}
	int x = 10;
	
	public static void main(String[] args){
		new Test();		
		System.out.println("main method");
	}
}


