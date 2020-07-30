class A{
    A(){
        System.out.println("A");
    }
}
class B extends A{
    B(int i){
        System.out.println("B"+" "+i);
    }
    public static void main(String[] args) {
        B b = new B(23);
        System.out.println("After B");
        A a = new A();
        System.out.println("After A");
    }
}
