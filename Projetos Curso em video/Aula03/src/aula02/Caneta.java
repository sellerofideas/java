
package aula02;


public class Caneta {
   public String modelo;
   public String cor;
   public int carga;
   private float ponta;
   protected boolean tampada;
   public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);      
    }
   public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro! Não posso rabiscar");
        }else{
            System.out.println("Estou rabiscando");
        }
    }
   protected void tampar(){
        this.tampada = true;
    }
   protected void destampar () {
        this.tampada = false;
    }
}

//PUBLIC é um modificador de classe que nos permite acessar 
//as classes e métodos de qualquer classe.

//PPRIVATE é um modificador de classes, métodos e objetos que nos dá acesso
//somente dentro da classe em que foi criado.

//PROTECTED 