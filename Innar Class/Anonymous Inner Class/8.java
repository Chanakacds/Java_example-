class Test {
	public static void main(String[] args){
		new Thread(()->{
			for(int i=1;i<=10;i++){
				System.out.println(i);
			}
		}).start();
		
		new Thread(()->{
			for(int i=75;i<=84;i++){
				System.out.println((char)i);
			}
		}).start();
	}
}





