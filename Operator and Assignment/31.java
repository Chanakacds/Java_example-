import java.util.*;

class A{
	public static void main(String [] args){
		Thread t = new Thread();
		System.out.println(t instanceof Thread);
		System.out.println(t instanceof Object);
		System.out.println(t instanceof Runnable);
	}
}