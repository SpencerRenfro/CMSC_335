package W1;

public class MyClassD {
    public static void main(String args[]) {
        MyClassC m = new MyClassC(23);
        System.out.println(m.v);
    }
}

class MyClassC {
    int v = 12;
    public MyClassC(int pV) {
       int v = pV;
    }
}
