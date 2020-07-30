class Test {
	public static void main(String[] args){
		int[] a = new int[]{10,20,30,40};
		int[] b = new int[]{20,30,40,50};
		int[] c = new int[]{50,60,70,80};
		int[] d = new int[]{60,20,30,50};
		m(new int[][]{a,b,c,d});
		m(a,b,c,d);
	}
	public static void m(int[]... array){
		for(int y[] : array){
			for(int x : y){
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}
}











