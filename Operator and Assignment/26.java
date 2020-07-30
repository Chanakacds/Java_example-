class A{
	public static void main(String [] args){
		Thread t1 = new Thread();
		String s  =new String("Java");
		Object o = new Object();
		Thread t3 = new Thread();
		
		System.out.println(t1==o);
		System.out.println(o==s);
		System.out.println(s==t1);
		
	}
}