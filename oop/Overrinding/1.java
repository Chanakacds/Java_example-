class P{
	
	public Object m1(){
		return "Object";
	}
}
class C extends P{
	
	public String m1(){
		return "String";
	}
}

class Test{
	
	public static void main(String [] args){
		
		P c1 =new C();
		
		System.out.println(c1.m1());
	}
}