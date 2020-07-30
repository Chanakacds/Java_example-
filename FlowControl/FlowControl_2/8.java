class Test {
	public static void main(String[] args){
		System.out.println(add(10,20));
		System.out.println(add(10,20,30));
		System.out.println(add(5,5));
		System.out.println(add(2,2));
	}
	
	public static int add(int... numbers){ 
		int sum = 0;
		for(int x : numbers){
			sum = sum+x;
		}
		return sum;
	}
}










