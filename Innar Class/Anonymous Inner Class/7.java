class Test {
	public static void main(String[] args){
		new Thread(new Runnable(){
			public void run(){
				for(int i=1;i<=10;i++){
					try{Thread.sleep(100);}catch(Exception e){}
					System.out.println(i);
				}
			}
		}).start();
		new Thread(new Runnable(){
			public void run(){
				for(int i=65;i<=75;i++){
					try{Thread.sleep(100);}catch(Exception e){}
					System.out.println((char)i);
				}
			}
		}).start();
	}
}





