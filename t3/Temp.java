package t3;
import java.lang.Math;

public class Temp {
    int C;
    //construct
    public Temp(int c) {
        C = c;
    }
    //get and set
    public void establecerC(int numC){
        C = numC;
    }
    public int obtenerC(){
        return C;
    }
   
    public void determinarF(){
        double F;
        F=((1.8)*obtenerC())+32;
        System.out.println("la conversion a farenheit es: "+F);
    }  
    public void determinarK(){
        double K;
        K=obtenerC()+273;
        System.out.println("la conversion a kelvin es: "+K);
    }  
    public void determinarR(){
        double R;
        R=(obtenerC()*(1.8))+491.67;
        System.out.println("la conversion a rankine es: "+R);
    }  
}