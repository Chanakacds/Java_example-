import java.util.*;

class Text{
	public static void main(String [] args){
		List list = new ArrayList();
		list.add(new Student());
		list.add(new Customer());
		Object o = list.get(0);
		if(o instanceof Student){
			 Student s =(Student)o;
			 System.out.println("perform student specific functionality");
			 
		}else if(o instanceof Customer){
			Customer c =(Customer)o;
			System.out.println("Perform customer specific functionality");
	}
}
}
class Student {int id;String name; }
class Customer {int id;String name; }