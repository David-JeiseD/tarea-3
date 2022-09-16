package t6;
import java.lang.Math;
public class Main {
    public static void main(String args[])
    {
        int[][] mA={{2,0,1},{3, 0, 0}, {5,1,1}};
        int[][] mB={{1,0,1},{1, 2, 1}, {1,1,0}};
    
        MultM multm = new MultM(mA, mB);
        multm.mostrarm1();
        multm.mostrarm2();
        multm.proc();
    }
}
