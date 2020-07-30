class A{
   public void m1(int i){
	   System.out.println(i);
	   
   }	
   public void m1(float s ){
	   System.out.println(s);
   }
}
class Test{
	public static void main(String [] args){
		A a = new A();
		a.m1(25);
		a.m1(23l);
		a.m1('a');
		a.m1(23.4d);
		
	}
}