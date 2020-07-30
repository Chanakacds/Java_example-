import java.util.Scanner;
class Test{
	public static void main(String args[]) throws Exception{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rows : ");
		int rows = sc.nextInt();
		
		for(int i=1;i<=rows;i++){
			for(int j=rows;j>i;j--){
				System.out.print(" ");
				Thread.sleep(100);
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
				Thread.sleep(100);
			}
			for(int j=2;j<=i;j++){
				System.out.print("*");
				Thread.sleep(100);
			}
			System.out.println();
			Thread.sleep(100);
		}
		
	}
}




