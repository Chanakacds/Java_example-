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
		parent p = new Child();
		p.m1();
		p.m2();
	}
		
	
}

// error: cannot find symbol
 //               p.m2();
             //   ^
  //symbol:   method m2()
  //location: variable p of type parent
