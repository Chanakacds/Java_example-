class A{
    A(){
        System.out.println("A");
    }
}
class B extends A{
    B(){
        System.out.println("B");
    }
    public static void main(String[] args) {
        B b = new B();
        System.out.println("After B");
        A a = new A();
        System.out.println("After A");
    }
}
