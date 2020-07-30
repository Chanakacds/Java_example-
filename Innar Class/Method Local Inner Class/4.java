class Test {
	public static void main(String[] args){
		new Test().m();
	}
	public void m(){
		int value = 100;
		class Inner {
			public void m2(){
				System.out.println(value);
			}
		}
		Inner inner = new Inner();
		inner.m2();
	}
}


