
package fecha;


public class Fecha {
private int dia, mes, año;
  Fecha(int d, int m, int a){
    dia= d;
    mes = m;
    año=a;
    normalizar(dia,mes,año);
  }

  public void setDias(int dia){
    this.dia=dia;
  }

  public void setMes(int mes){
    this.mes=mes;
  }

  public void setAño(int año){
    this.año=año;
  
  }

  public int getDia(){
    return dia;
  }

  public void reinciarDias(int d, int m, int a){
    dia=d;
    mes=m;
    año=a;
    normalizar(dia,mes,año);
  }

  public void adelantar(int d, int m, int a){
    año=año+a;
    mes=mes+m;
    dia=dia+d;
    normalizar(dia,mes,año);
  }

  public void normalizar(int d, int m, int a){
    if(a==0){
      año=1;
    }
    else{
      año=Math.abs(a);
    }
    if(m==0){
      mes=1;
    }
    else{
      mes=(Math.abs(m))%12;
    }
    if(d==0){
      dia=1;
    }
    else{
      dia= (Math.abs(d))%dias(mes);
    }
  }

  public int dias(int m){
    if (m == 2){
      return 28;
      
    }
    else if(m == 1 || m==3 || m==5 || m==7 || m==8 || m ==10 || m == 12){
      return 31;
      
    }
    else{
      return 30;
    }
  }
  
  public void imprimir(){
    System.out.println(dia+"/"+mes+"/"+año);
  }  

  


}