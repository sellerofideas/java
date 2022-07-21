package ultraemojicombat;

import java.util.Random;

public class Luta {
private Lutador desafiado;
private Lutador desafiante;
private int rounds;
private boolean aprovada;

public void marcarLuta(Lutador l1, Lutador l2){
    if(l1.getCategoria().equals(l2.getCategoria())&& l1 != l2) {
    this.aprovada = true;
    this.desafiado = l1;
    this.desafiante = l2;
    }else{
        this.aprovada = false;
        this.desafiado = null;
        this.desafiante = null;
    }
}
public void lutar(){
    if(this.aprovada){
        System.out.println("###DESAFIADO###");
        this.desafiado.apresentar();
        System.out.println("###DESAFIANTE###");
        this.desafiante.apresentar();
        
        Random aleatorio = new Random();
        int vencedor = aleatorio.nextInt(3);
        System.out.println("=========RESULTADO DA LUTA ===============");
        switch(vencedor){
            case 0: //Caso der empate
                System.out.println("Empatou");
                this.desafiado.empatar();
                this.desafiante.empatar();
                break;
            case 1: //Caso desafiado vença
                System.out.println("Vitória do "+ this.desafiado.getNome());
                this.desafiado.ganhar();
                this.desafiante.perder();
                break;
            case 2: //Caso desafiante ganhe
                System.out.println("Votória do "+ this.desafiante.getNome());
                this.desafiado.perder();
                this.desafiante.ganhar();
            break;
        }
        System.out.println("======================================");
    }
}

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}