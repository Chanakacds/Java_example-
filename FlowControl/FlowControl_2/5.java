class Test {
	public static void main(String[] args){
		outerLoop:for(int i=1;i<=1000;i++){
			System.out.println("I am I : "+i);
			for(int j=1;j<=100;j++){
				//System.out.println("I am J : "+j);
				for(int k = 1;k<=10;k++){
					//System.out.println("I am K : "+k);
					if(i==10){
						System.out.println("I is : "+i);
						break outerLoop;
					}
				}
			}
		}
	}
}




