class Outer {
	int x = 30;
	class Inner {
		int x = 20;
		public void m1(){
			int x = 10;
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(Outer.this.x);
		}
	}
	public static void main(String[] args){
		new Outer().new Inner().m1();
	}
}

