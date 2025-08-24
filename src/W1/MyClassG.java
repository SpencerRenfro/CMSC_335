package W1;

public class MyClassG {
    public static void main(String args[]) {
        MyClassH m = new MyClassH(23, true);
        System.out.println(m.v);
    }
}

 class MyClassH {
    int v = 12;

    public MyClassH (int x, boolean b) {
        this (x);
    }

    private MyClassH (int pV) {
        v = pV;
    }
}
