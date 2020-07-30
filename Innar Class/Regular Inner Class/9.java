class Outer {
	class Inner {
		public void m1(){
			System.out.println("this is m1");
		}
	}
	public static void main(String[] args){
		Inner inner = new Outer().new Inner();
		inner.m1();
	}
}

