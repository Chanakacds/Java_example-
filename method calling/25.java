class Com {
    int a;
    void printValue(int i, int j) {
		int a = 5;
        a = i;
        System.out.println(this.a + j);
    }
}

class DemoCom {
    public static void main(String args[]) {
        Com a = new Com();
        a.printValue(100, 100);
    }
}


