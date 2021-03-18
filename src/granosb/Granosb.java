
package granosb;

import java.util.Scanner;


public class Granosb {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tablero;
        System.out.println("Ingrese el tamaño del tablero");
        tablero= in.nextInt();
        long resultado= contarGranito(tablero);
        System.out.println("La cantidad de granitos que hay en el tablero es de: "+resultado+" "+"Y se necesitaria de "+resultado+" segundo/s para contar el/ grano/s");      
    }
   
    public static long contarGranito(int t){
    long  total=1, granito=1;
        if(t==1){
            return total;
        }else{
            for(int i=1; i<t;i++){
                granito= granito+2;
                total= total + granito;
                
            }
        return total;
        }
    }
    
}
