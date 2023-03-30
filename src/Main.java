import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Poin3D poin3D = new Poin3D(3, 4,5);
        Poin2D poin2D = new Poin2D(3,7);
        System.out.println(poin3D);
        float[] cc = poin3D.getXYZ();
        System.out.println(Arrays.toString(cc));
        float[] dd = poin2D.getXY();
        System.out.println(Arrays.toString(dd));
     }
}