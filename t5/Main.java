package t5;
import java.lang.Math;
public class Main {
    public static void main(String args[])
    {
        int[][] mA={{6,7,5},{3, 8, 4}, {1,3,2}};
        int[][] mB={{2,1,3},{1, 1, 1}, {4,2,3}};
    
        SumaMatriz sumamatriz = new SumaMatriz(mA, mB);
        sumamatriz.mostrarm1();
        sumamatriz.mostrarm2();
        sumamatriz.summat();
    }
}
