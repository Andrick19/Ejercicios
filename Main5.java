
package poo;


public class Main5 {
    
    void sumarContadorMain(){
        CuentaCorriente.contador +=100;
        sumarContadorMain();
    }
    
    static void sumarContadorMain1(){
        CuentaCorriente.contador +=100;
        Main5 main=new Main5();
        main.sumarContadorMain();
        
        
    }
    
    public static void main(String[]args){
        
        Main5 main = new Main5();
        main.sumarContadorMain();
        
        Main5.sumarContadorMain1();
        sumarContadorMain1();
        
        
        CuentaCorriente.sumarContador();
        System.out.println(CuentaCorriente.contador);
        //Cuenta Corriente.saldo=100;
        
        CuentaCorriente cta= new CuentaCorriente();
        cta.saldo=100;
        
        CuentaCorriente cta1=new CuentaCorriente();
        cta1.saldo=1000;
    }
}
