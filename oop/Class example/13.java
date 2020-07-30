class Test implements Cloneable {
	public static void main(String[] args)throws CloneNotSupportedException{
		Test t1 = new Test();
		System.out.println(t1.hashCode());
		
		Test t2 = (Test)t1.clone();
		System.out.println(t2.hashCode());
	}
}




