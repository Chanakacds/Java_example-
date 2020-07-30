class Test {
	public static void main(String[] args){
		Runnable r = new Runnable(){
			public void run(){
				for(int i=1;i<=10;i++){
					System.out.println("Inside run method");
				}
			}
		};
		Thread t = new Thread(r);
		t.start();
	}
}
