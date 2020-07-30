class Test {
	public static void main(String[] args){
		Thread t1 = new Thread(){
			public void run(){
				for(int i=1;i<=10;i++){
					System.out.println(i);
				}
			}
		};
		t1.start();
		
		Thread t2 = new Thread(){
			public void run(){
				for(int i=65;i<=75;i++){
					System.out.println((char)i);
				}
			}
		};
		t2.start();
	}
}