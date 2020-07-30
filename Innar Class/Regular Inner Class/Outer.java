public class Outer {
	int x = 50;
	public class Inner {
		int x = 40;
		public void m1(){
			int x = 30;
			System.out.println(x);
			System.out.println("pubilc Inner class");
		}
	}
	public static void main(String[] args){
		new Outer().new Inner().m1();
	}
}