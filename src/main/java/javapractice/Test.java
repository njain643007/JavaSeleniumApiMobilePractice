package javapractice;

interface A {
    void methodA1();
    void methodA2();
    void methodA3();
    void methodA4();
}

interface B {
    void methodB1();
    void methodB2();
}

class MyPartialClass implements A, B {
    public void methodA1() {
        System.out.println("Implemented A1");
    }

    public void methodB1() {
        System.out.println("Implemented B1");
    }
    @Override
    public void methodB2() {

    }

    @Override
    public void methodA2() {

    }

    @Override
    public void methodA3() {

    }

    @Override
    public void methodA4() {

    }
    // Remaining methods are NOT implemented, so class must be abstract
}



public class Test {
    public static void main(String[] args) {
        MyPartialClass obj = new MyPartialClass();


    }
}