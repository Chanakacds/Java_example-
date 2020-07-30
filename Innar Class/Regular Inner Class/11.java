class Outer {
	class Inner {
		public void m1(){
			System.out.println("System.out.println");
		}
	}
	public void m2(){
		//new Inner().m1();
		Inner inner = new Inner();
		inner.m1();
	}
	public static void main(String[] args){
		Outer outer = new Outer();
		outer.m2();
	}
}

