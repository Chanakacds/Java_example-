interface I {
	
	public abstract void m1();
	public abstract void m2();

}

abstract class  A implements I{
	public void m1(){
		
		
	}
}
	 class B extends A{
		
		
		
}
// error: B is not abstract and does not override abstract method m2() in I
     //   class B extends A{