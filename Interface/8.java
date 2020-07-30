interface I{
  public void m1();	  
}

interface o{
	public void m1();
}

class Test implements I,o{
	public void m1(){
		System.out.println("Overrriding methods");
		
	}
	public static void main(String [] args){
	new Test().m1();
}
}

