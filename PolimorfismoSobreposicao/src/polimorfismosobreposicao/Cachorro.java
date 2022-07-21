package polimorfismosobreposicao;
public class Cachorro extends Mamifero{
    
    public void nome(){
        System.out.println(this.getNome());
       
    }
    @Override
    public void poderEspecial(){
        System.out.println("Poder: Latindo e Mordendo ");
        System.out.println(" ");
    }
}
