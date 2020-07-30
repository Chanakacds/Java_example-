class Outer {
	class Inner {
		public void m1(){
			System.out.println("this is new m1");
		}
	}
	public static void main(String[] args){
		Outer outer = new Outer();
		Inner inner = outer.new Inner();
		inner.m1();
	}
}

