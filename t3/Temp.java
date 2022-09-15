package t3;
import java.lang.Math;

public class Temp {
    int centigrados;
    //construct
    public Temp(int c) {
        centigrados = c;
    }
    //get and set
    public void establecerC(int C){
        centigrados = C;
    }
    public int obtenerC(){
        return centigrados;
    }
   
    public void determinarF(){
        double farenheit;
        farenheit=((1.8)*obtenerC())+32;
        System.out.println("la conversion a farenheit es: "+farenheit+"°");
    }  
    public void determinarK(){
        double kelvin;
        kelvin=obtenerC()+273;
        System.out.println("la conversion a kelvin es: "+kelvin+"°");
    }  
    public void determinarR(){
        double rankine;
        rankine=(obtenerC()*(1.8))+491.67;
        System.out.println("la conversion a rankine es: "+rankine+"°");
    }  
}