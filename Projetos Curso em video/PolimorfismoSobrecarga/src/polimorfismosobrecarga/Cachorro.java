package polimorfismosobrecarga;
public class Cachorro extends Lobo {
    
    @Override
    public void emitirSom(){
        System.out.println("Au! au! au!");
    }
    public void reagir(String frase){
        if(frase.equals("Toma comida")|| frase.equals("Olá!")){
            System.out.println("Abanando e Latindo");
        }else if(frase.endsWith("Vai apanhar!"))
            System.out.println("Rosnando");
        }
    public void reagir(int hora, int min){
        if (hora < 12) {
            System.out.println("Abanando o rabo");
        } else if(hora >= 18){
            System.out.println("Ignorando");
        }else{
            System.out.println("Abanar e latir");
        }
    }
    public void reagir(boolean dono){
        if (dono) {
            System.out.println("Abanando");
        } else {
            System.out.println("Rosnando e Lantindo");
        }
    }
    public void reagir(int idade, float peso){
        if (idade <5) {
            if (peso <10) {
                System.out.println("Abanando o rabo");
            } else {
                System.out.println("Latindo");
            }
        } else {
            System.out.println("Ignorar");
        }
    }
    }
   



    
