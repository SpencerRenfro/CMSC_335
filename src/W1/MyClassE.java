package W1;

public class MyClassE {
    public static void main (String args []) {
        MyClassF m = new MyClassF (23);
        System.out.println(m.v);
    }
}

class MyClassF {
    int v = 12;

    public MyClassF (int pV) {
        v = pV;
    }
}
