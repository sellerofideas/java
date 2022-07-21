package polimorfismosobreposicao;
public class Canguru extends Mamifero{
    
    public void nome(){
        System.out.println(this.getNome());
        
    }
    @Override
    public void poderEspecial(){
        System.out.println("Poder: Chutando");
        System.out.println(" ");
    }
    @Override
    public void locomover(){
        System.out.println("Saltando");
    }
    
}
