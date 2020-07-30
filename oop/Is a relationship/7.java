class A{
	public void m1(int i){
		
		System.out.println(i);
	}
	
	public void m2(String s){
		System.out.println(s);
	}
}

class Test{
	
	public static void main(String [] args){
		
		A test = new A();
		
		test.m1(23);
		test.m2("Java");
	}
}