package polimorfismosobreposicao;
public class Cobra extends Reptil{
    public void nome(){
        System.out.println(this.getNome());
    }
    
    @Override
    public void poderEspecial(){
        System.out.println("Poder: Picando");
        System.out.println(" ");
    }
    
}
