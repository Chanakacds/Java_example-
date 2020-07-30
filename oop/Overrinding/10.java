class P{
	
	public static void m1(){
		System.out.println("Parent");
	}
}
class C extends P{
	
	public static void m2(){
		System.out.println("Child");
	}
}

class Test{
	
	public static void main(String [] args){
		
		
		C c1 =new C();
		c1.m1();
		c1.m2();
		
	

		
		
		
	}
}
//error