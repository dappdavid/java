package prep.playground;

public class Example {

    public static void main(String[] args) {
        Example e = new Example2();
        e.test();
    }
    public void test(){
        System.out.println("In Example test");
    }
}


class Example2 extends Example{

    public void test(){
        System.out.println("In Example2 test");
    }
}