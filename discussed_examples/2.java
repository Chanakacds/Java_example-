class Test {
	public static void main(String[] args){
		int[] numbers = new int[4];
		for(int i=0;i<numbers.length;i++){
			numbers[i] = 10;
		}
		System.out.println("------------------------");
		int i=0;
		while(i<numbers.length){
			System.out.println(numbers[++i]);
		}
	}
}


