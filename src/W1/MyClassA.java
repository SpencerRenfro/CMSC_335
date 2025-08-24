package W1;

public class MyClassA {
    int v = 12;
    public MyClassA(int pV) {
        v = pV;
    }
    public MyClassA() {

    }

    public static void main(String args []) {
        MyClassA m = new MyClassA();
        System.out.println(m.v);
    }
}