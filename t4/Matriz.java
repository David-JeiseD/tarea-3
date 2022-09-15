package t4;
public class Matriz {
    int fil;
    int col;
//constructor
    public Matriz(int f, int c){
        fil = f;
        col = c;
    }
    //get and set
    public void setFil(int f){
        fil = f;
    }
    public int getFil(){
        return fil;
    }
    public void setCol(int c){
        col = c;
    }
    public int getCol(){
        return col;
    }
    public int[][] llenarMatriz(){
        int[][] ma = new int[getFil()][getCol()];
        
        for (int i = 0; i < getFil(); i++) {
            for (int j = 0; j < getCol(); j ++) {
                ma[i][j] = (i *getFil()) + (j + 1);
            }
        }
        return ma;
    }
    public void mostrarDatos(){
        int[][] ma = new int[getFil()][getCol()];
        for (int i = 0; i < getFil(); i++) {
            for (int j = 0; j < getCol(); j++){
                System.out.print(llenarMatriz()[i][j]+"     ");
            }
            System.out.println("");
        }
    } 

}

