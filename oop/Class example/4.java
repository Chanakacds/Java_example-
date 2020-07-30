class Test {
	int x = 25;
	{
		System.out.println(this.x);
	}
	
	Test (){
		System.out.println(this.x);
	}
	public static void main(String[] args){
		Test test = new Test();
		System.out.println(test.x);
	}
}


