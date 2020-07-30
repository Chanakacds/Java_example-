import java.util.Scanner;
class Test {
	public static String PASS = " you have passed the exam";
	public static String FAIL = " you have failed the exam";
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		System.out.println("add -100 to stop the program");
		while(true){
			System.out.print("enter marks : ");
			int marks = sc.nextInt();
			if(marks == -100){
				break;
			}
			String status = (marks >= 720)?PASS:FAIL;
			System.out.println(status);
			System.out.println();
		}
	}
}




