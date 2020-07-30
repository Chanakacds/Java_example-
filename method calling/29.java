class A29 {
    int a, b;
    void printValue(int a, int c) {
        System.out.println(a + " " + b + " " + (a + b));
    }
}

class DemoA29 {
    public static void main(String args[]) {
        A29 a = new A29();
        a.printValue(2, 4);
    }
}
