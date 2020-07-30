class Test {
	public static void main(String[] args){
		Cat kitty = new Cat();
		System.out.println(kitty instanceof Cat);
		System.out.println(kitty instanceof Animal);
		System.out.println(kitty instanceof Object);
	}
	
	public static Animal getAnimal(String eatingMethod){
		if(eatingMethod.equals("dogeating")){
			new Dog();
		} else if (eatingMethod.equals("cateating")){
			new Cat();
		} else if (eatingMethod.equals("duckeating")){
			new Duck();
		}
	}
}
class Animal{}
class Cat extends Animal {}
class Dog extends Animal{}
class Duck extends Animal{}

