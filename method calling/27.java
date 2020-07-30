class A26 {
    void printValue(int a, double d) {
        System.out.print(a + " " + d + " " + (a + d));
    }
}

class DemoA26 {
    public static void main(String args[]) {
        A26 a = new A26();
        a.printValue(2, 2);
    }
}
