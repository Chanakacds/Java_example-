class Outer {
	class Inner {
		public void m1(){
			int x = 10;
			System.out.println(x);
		}
	}
	public static void main(String[] args){
		new Outer().new Inner().m1();
	}
}

