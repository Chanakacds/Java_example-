class Black {
	int a;
	void setA(int a) {
		this.a = a;
	}
}

class DemoBlack {
    public static void main(String args[]) {
        Black a1 = new Black();
        a1.setA(10);
        System.out.println(a1.a);
    }
}
