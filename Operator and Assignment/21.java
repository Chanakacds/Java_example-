class A{
	public static void main(String [] args){
		Student s1 = new Student();
		Student s2 = new Student();
		
		
		System.out.println(s1>s2);
	}
}

class Student{
	String name;
	int age;
}