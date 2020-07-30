class Constructor {
    int a;
    Constructor() {
        a = 10;
    }
}

class Demo{
    public static void main(String[] args){
        Constructor c = new Constructor();
        System.out.println(c.a);
    }
}