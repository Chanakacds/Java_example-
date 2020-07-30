class parent{
	public void m1(){
		System.out.println("Parent method");
	}
}

class Child extends parent{
	public void m2(){
		System.out.println("Child methods");
		
	}
}

class Test{
	public static void main(String [] args){
		Child c = new Child();
		c.m1();
		c.m2();
	}
		
	
}
//ok run 