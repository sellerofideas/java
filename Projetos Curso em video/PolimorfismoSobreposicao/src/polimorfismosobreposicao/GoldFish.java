package polimorfismosobreposicao;
public class GoldFish extends Peixe{
    
    public void nome(){
        System.out.println(this.getNome());
    }
    @Override
    public void poderEspecial(){
        System.out.println("Poder: Brilhando");
        System.out.println(" ");
    }
}
