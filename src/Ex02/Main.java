package Ex02;

public class Main {
    int x, y, z;
    public static void main(String[] args) {
        Main e1 = new Main();
        Main e2 = new Main();

        e1.x = e1.z + e2.x + e2.y;
        e2.y = 2*e1.x + e2.z;
        e1.z = e2.z + e1.y;
        e2.z = e2.z + 2;
        System.out.println(e1.x);
        System.out.println(e1.y);
        System.out.println(e1.z);
        System.out.println(e2.x);
        System.out.println(e2.y);
        System.out.println(e2.z);


    }
}
