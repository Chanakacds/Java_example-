class A{     
	double a, b;
	int printValue(double i,double j){
		a=i;
		b=j;
		return a*j ;	
	}	
}	
class DemoA{
	public static void main(String args[]){
		A a1=new A();	
		System.out.println(a1.printValue(3,2));
	}
}
