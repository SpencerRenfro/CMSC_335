package W1;

public class MyClassB {
    int v = 12;

    public void  MyClassB(int pV) {
        this.v = pV;
        System.out.println(v);
    }

    public static void main (String args []) {
        MyClassB m = new MyClassB();
        m.MyClassB(10);
    }
}
