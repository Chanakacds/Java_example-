class Outer {
	class Inner {
		public void m1(){
			System.out.println("this is me");
		}
	}
	
	public static void main(String[] args){
		new Outer().new Inner().m1();
	}
}

