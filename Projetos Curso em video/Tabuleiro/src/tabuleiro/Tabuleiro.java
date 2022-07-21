package tabuleiro;
public class Tabuleiro {
    public static void main(String[] args) {
        Profissoes player[] = new Profissoes[10];
        
        player[0] = new Profissoes("Médico", "Branco", 15.001, 00, true );
        player[1] = new Profissoes("Advogado", "preto", 5000, 00, true);
        player[2] = new Profissoes("Lixeiro", "verde", 1500, 00, true);
        player[3] = new Profissoes("Faxineiro", "Roxo", 1200, 00, true);
        player[4] = new Profissoes("Coach","Vermelho", 3000, 00, true);
        player[5] = new Profissoes("Professor", "Cinza", 1200, 00, true);
        player[6] = new Profissoes("Programador", "Azul", 3500, 00, true);
        player[7] = new Profissoes("Segurança", "Dourado", 1300, 00, true);
        player[8] = new Profissoes("Engenheiro", "laranja", 5000, 00, true);
        player[9]= new Profissoes("Farmaceutico", "Rosa", 3200, 00, true);
        
        player[0].status();
        player[1].status();
        player[2].status();
        player[3].status();
        player[4].status();
        player[5].status();
        player[6].status();
        player[7].status();
        player[8].status();
        player[9].status();
    }
}
