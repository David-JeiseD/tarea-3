package t1;
import java.lang.Math;
public class EcuacionCuadratica {
    int a;
    int b;
    int c;
    //constructor
    public EcuacionCuadratica(int numA,int numB,int numC){
        a = numA;
        b = numB;
        c = numC;
    }
    //fin constructor
    /////////get-set
    public void establecerA(int numA){
        a = numA;
    }
    public int obtenerA(){
        return a;
    }
    public void establecerB(int numB){
        b = numB;
    }
    public int obtenerB(){
        return b;
    }
    public void establecarC(int numC){
        c = numC;
    }
    public int obtenerC(){
        return c;
    }
    ////////////end get-set
    
    public double discriminante(){
        double expresion=0;
        double result1=0;
        double result2=0;
        expresion = Math.pow(obtenerB(), 2) - 4*obtenerA()*obtenerC();
        if (expresion > 0)
        {
            result1=(-obtenerB()+(Math.sqrt(expresion)))/(2*obtenerA());
            result2=(-obtenerB()-(Math.sqrt(expresion)))/(2*obtenerA());
            System.out.println("\ntiene dos soluciones");
            System.out.println("x1 = "+result1);
            System.out.println("x2 = "+result2);
        }
        if (expresion == 0) 
        {
            result1=(-obtenerB()+(Math.sqrt(expresion)))/(2*obtenerA());
            System.out.println("\nsolo tiene una solucion\nx1 = "+result1);
        }
        if(expresion < 0)
        {
            System.out.println("no tiene solucion real");
        }
        return 0;
    }  
  
}
