class Test{
	Test(){
		this(10);
		System.out.println("constructor");
	}
	Test (int x){
		super();
		System.out.println("constructor  x");
	}
	public static void main(String[] args){
		new Test();
	}
}




