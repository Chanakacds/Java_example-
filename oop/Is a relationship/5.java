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
		Child p = new parent();
		p.m1();
		p.m2();
	}
		
	
}
//error: incompatible types: parent cannot be converted to Child
    //            Child p = new parent();