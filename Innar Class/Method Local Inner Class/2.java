class Test {
	public static void main(String[] args){
		new Test().m();
	}
	public void m(){
		class Inner {
			public void sum(int x, int y){
				System.out.println(x+y);
			}
		}
		Inner inner = new Inner();
		inner.sum(1,2);
		inner.sum(2,3);
	}
}




