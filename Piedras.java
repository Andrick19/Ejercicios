
package piedras;


public class Piedras {
    enum Piedra {
       CALIZA(1200), MARMOL(1423.55), PIZARRA(1325), CUARZITA(1466.22);
       private double peso;
       
       Piedra(double n){peso=n;}
       double getPeso(){return peso;}
       
    }
    }
 