
package conceptos.poo;


public class Main {

    int contador;
    static int suma = 100;
    
    public void contar(){
        contador++;
    }
    
    public static void sumar(){
        suma++;
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.contador=100;
        main.contar();
        
        Main.suma=100;
        suma=100;
        Main.sumar();
        sumar();
        
    }
    
}
