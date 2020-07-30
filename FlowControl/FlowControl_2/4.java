class Test {
	public static void main(String[] args){
		label:{
			System.out.println("begin");
			int x = 10;
			if(x>5){
				break label;
			}
			System.out.println("end");
		}
	}
}



