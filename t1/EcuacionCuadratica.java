package t1;
import java.lang.Math;
public class EcuacionCuadratica {
    double a;
    double b;
    double c;
    double expresion=0;
    double result1=0;
    double result2=0;
    public void establecerA(double numA){
        a = numA;
    }
    public double obtenerA(){
        return a;
    }
    public void establecerB(double numB){
        b = numB;
    }
    public double obtenerB(){
        return b;
    }
    public void establecarC(double numC){
        c = numC;
    }
    public double obtenerC(){
        return c;
    }
    public double discriminante(){
        expresion = Math.pow(obtenerB(), 2) - 4*obtenerA()*obtenerC();
        if (expresion > 0)
        {
            proceso();
            respuesta();
        }
        if (expresion == 0) 
        {
            proceso();
            respuesta();
        }
        if(expresion < 0)
        {
            System.out.println("no tiene solucion real");
        }
        return 0;
    }  
    public void proceso(){
        //formula
        result1=(-obtenerB()+(Math.sqrt(expresion)))/(2*obtenerA());
        result2=(-obtenerB()-(Math.sqrt(expresion)))/(2*obtenerA());
    }
    public void respuesta(){
        System.out.println("x1 = "+result1);
        System.out.println("x2 = "+result2);
    }
}
