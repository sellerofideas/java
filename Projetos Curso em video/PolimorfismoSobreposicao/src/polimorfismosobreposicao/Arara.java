package polimorfismosobreposicao;
public class Arara extends Ave{
    public void nome(){
        System.out.println(this.getNome());
    }
    @Override
    public void poderEspecial(){
        System.out.println("Poder: Jogando ovos");
        System.out.println(" ");
    }
}
