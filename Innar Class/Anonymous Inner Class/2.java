interface Animal {
	public abstract void eat();
}
class Test {
	public static void main(String[] args){
		Animal dog = new Animal(){
			public void eat(){
				System.out.println("Dog is eating");
			}
		};
		dog.eat();	
		
		Animal cat = new Animal(){
			public void eat(){
				System.out.println("Cat is eating");
			}
		};
		cat.eat();
	}
}



