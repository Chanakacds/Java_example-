class Test {
	public static void main(String[] args){
		Cat kitty = new Cat();
		System.out.println(kitty instanceof Cat);
		System.out.println(kitty instanceof Animal);
		System.out.println(kitty instanceof Object);
	}
}
class Animal{}
class Cat extends Animal {}

