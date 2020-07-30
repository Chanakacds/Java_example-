interface I{
  public static final int x= 200;	  
}

interface o{
	public static final int x = 300;
}

class Test implements I,o{
	
	public static void main(String [] args){
	System.out.println(I.x);
	System.out.println(o.x);
}
}

