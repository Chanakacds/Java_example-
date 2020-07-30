class Constructor4{
	int x=100;
	int y=200;
	Constructor4(){
		super();
		System.out.print(x+" ");
		System.out.print(y+" ");
		x = 30;
		y = 40;
	}
}
class Demo{
	public static void main (String []args){
		Constructor4 c = new Constructor4();
		System.out.print(c.x+" ");
		System.out.print(c.y+" ");
	}
}
