package t5;
import java.lang.Math;
public class SumaMatriz {
    
    public int [][] m1;
    public int [][] m2;
    //construct
    public SumaMatriz(int[][] mA, int[][] mB) {
        m1 = mA;
        m2 = mB;
    }
    //get and set
    public void setM1(int[][] mA) {
        m1 = mA;
    }
    public void setM2(int[][] mB) {
        m2 = mB;
    }
    public int[][] getM1() {
        return m1;
    }
    public int[][] getM2() {
        return m2;
    }
    public int[][] summat(){
        int [][] r = new int [m1.length][m1[0].length];
        System.out.println(" \n\nresultado de la suma ");
        for(int i=0;i<m1.length;i++){
            System.out.println(" ");
            for(int j=0;j<m1[i].length;j++){
                r[i][j]=m1[i][j]+m2[i][j];
                System.out.print(r[i][j]+"     ");
            }
        }
        return r;
    }
    public int[][] mostrarm1(){
        System.out.println(" \nm1= ");
        for(int i=0;i<m1.length;i++){
            System.out.println(" ");
            for(int j=0;j<m1[i].length;j++){
                System.out.print(m1[i][j]+"     ");
            }
        }
        return m1;
    }
    public int[][] mostrarm2(){
        System.out.println(" \n\nm2= ");
        for(int i=0;i<m1.length;i++){
            System.out.println(" ");
            for(int j=0;j<m1[i].length;j++){    
                System.out.print(m2[i][j]+"     ");
            }
        }
        return m2;
    }
    
}
