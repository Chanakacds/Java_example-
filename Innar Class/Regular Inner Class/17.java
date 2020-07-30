class Outer {
	static int x = 10;
	class Inner {
		public void m1(){
			System.out.println(x);
		}
	}
	public static void main(String[] args){
		new Outer().new Inner().m1();
	}
}


