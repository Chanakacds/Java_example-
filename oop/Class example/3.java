class Test {
	{
		System.out.println("instance block : "+this.hashCode());
	}
	
	Test (){
		System.out.println("constructor : "+this.hashCode());
	}
	public static void main(String[] args){
		Test test = new Test();
		System.out.println("main method : "+test.hashCode());
	}
}


