package t2;
import java.lang.Math;

public class Ej1 {
    int n;
    int base;
    //construct 
    public Ej1(int numA, int numB) {
        n = numA;
        base = numB;
    }
    //get and set
    public void establecerN(int numA){
        n = numA;
    }
    public int obtenerN(){
        return n;
    }
    public void establecerBase(int numB){
        base = numB;
    }
    public int obtenerBase(){
        return base;
    }
   
    public void determinar(){
        int inv=0;
        while(obtenerN()>0){
            inv=10*inv +obtenerN()%obtenerBase();
            n = obtenerN()/obtenerBase();
        }
        while(inv>0){
            n=10*obtenerN() +inv%obtenerBase();
            inv=inv/10;
        }
        System.out.println("la conversion es: "+obtenerN());
    }  
    
}