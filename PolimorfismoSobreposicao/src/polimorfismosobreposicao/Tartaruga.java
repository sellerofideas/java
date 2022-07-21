package polimorfismosobreposicao;
public class Tartaruga extends Reptil {
    
    public void nome(){
        System.out.println(this.getNome());
    }
    @Override
    public void poderEspecial(){
        System.out.println("Poder: Defendendo com o casco");
        System.out.println(" ");
    }
    
    @Override
    public void locomover(){
        System.out.println("Andando Bemmm de vagar");
    }
}
