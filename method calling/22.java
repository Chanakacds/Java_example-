class A{
	byte print(byte b){ 
		return b;
	}
}			
class DemoA{
	public static void main(String args[]){
		A a=new A();
		System.out.print(a.print(5));		
	}
}
