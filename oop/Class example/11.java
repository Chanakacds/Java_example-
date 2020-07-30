class Test {
	public static void main(String[] args)throws Exception{
		Test t1 = new Test();
		System.out.println(t1.hashCode());
		
		Test t2 = Test.class.newInstance();
		System.out.println(t2.hashCode());
		
		Test t3 = (Test)(Class.forName("Test")).newInstance();
		System.out.println(t3.hashCode());
	}
}



