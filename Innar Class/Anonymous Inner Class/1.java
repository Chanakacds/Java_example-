interface Animal {
	public abstract void eat();
}
class Dog implements Animal {
	public void eat() {
		System.out.println("Dog is eating");
	}
}
class Test {
	public static void main(String[] args){
		Animal animal = new Dog();
		animal.eat();
	}
}



