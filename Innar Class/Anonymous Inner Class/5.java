class Child implements Runnable {
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("Inside run method");
		}
	}
}
class Test {
	public static void main(String[] args){
		Child child = new Child(); 
		Thread t = new Thread(child);
		t.start();
	}
}


