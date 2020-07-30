class Test {
	int y = 45;
	public void m1(){
		System.out.println("this is instance method");
	}
	
	public static void main(String[] args){
		Test t = new Test();
		System.out.println(t.y);
		t.m1();
	}
}

