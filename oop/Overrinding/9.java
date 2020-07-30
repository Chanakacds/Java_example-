class P{
	
	public static void m1(){
		System.out.println("Parent");
	}
}
class C extends P{
	
	public static void m1(){
		System.out.println("Child");
	}
}

class Test{
	
	public static void main(String [] args){
		P p1= new P();
		p1.m1();
		
		C c1 =new C();
		c1.m1();
		
		P p2 =new C();
	    p2.m1();

		
		
		
	}
}
//error