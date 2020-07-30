class Outer {
	int x = 50;
	class Inner {
		int x = 40;
		public void m1(){
			int x = 30;
			System.out.println(x);
		}
	}
}
class Test {
	public static void main(String[] args){
		new Outer().new Inner().m1();
	}
}

