class A{
    A(String s){
		System.out.println(s);
	}
}
class B extends A{
    B(){
        super("java");
        System.out.println("B");
    }
    public static void main(String[] args){
        B b = new B();
        System.out.println("After B");
        A a = new A("language");
        System.out.println("After A");
    }
}
