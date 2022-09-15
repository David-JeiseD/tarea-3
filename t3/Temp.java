package t3;
import java.lang.Math;

public class Temp {
    int Centigrados;
    //construct
    public Temp(int c) {
        Centigrados = c;
    }
    //get and set
    public void establecerC(int C){
        Centigrados = C;
    }
    public int obtenerC(){
        return Centigrados;
    }
   
    public void determinarF(){
        double Farenheit;
        Farenheit=((1.8)*obtenerC())+32;
        System.out.println("la conversion a farenheit es: "+Farenheit+"°");
    }  
    public void determinarK(){
        double Kelvin;
        Kelvin=obtenerC()+273;
        System.out.println("la conversion a kelvin es: "+Kelvin+"°");
    }  
    public void determinarR(){
        double Rankine;
        Rankine=(obtenerC()*(1.8))+491.67;
        System.out.println("la conversion a rankine es: "+Rankine+"°");
    }  
}