class Outer {
	class Inner {
		static int x = 10;
		public void m1(){
			System.out.println(x);
		}
	}
	public static void main(String[] args){
		new Outer().new Inner().m1();
	}
}


