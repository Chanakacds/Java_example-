class Test {
	public static void main(String[] args)throws Exception{
		Runtime r1 = Runtime.getRuntime();
		System.out.println(r1.hashCode());
		
		Runtime r2 = new Runtime();
		System.out.println(r2.hashCode());
	}
}



