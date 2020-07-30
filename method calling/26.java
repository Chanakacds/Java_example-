class D{  
	double a, b;
	double printValue(int i,int j){
		a=i;
		b=j;
		return a*j ;
	}	
}	
class DemoD{
	public static void main(String args[]){
		D a1=new D();	
		System.out.println(a1.printValue(3,2));
	}
}
