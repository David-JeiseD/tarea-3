package t3;

public class Main {

    public static void main(String args[])
    {
        Temp temp = new Temp(15);
        System.out.println("\nValor de grados celcius es: "+temp.obtenerC()+"°");
        temp.determinarF();
        temp.determinarK();
        temp.determinarR();
    }
}
