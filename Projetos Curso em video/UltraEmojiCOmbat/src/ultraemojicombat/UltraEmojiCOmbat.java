package ultraemojicombat;
public class UltraEmojiCOmbat {
    public static void main(String[] args) {
       Lutador l[] = new Lutador [6];
               
       l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
       l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
       l[2] = new Lutador("Snapshadow", "Eua", 35, 1.68f, 57.8f, 14, 2, 3);
       l[3] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
       l[4] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
       l[5] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
      
                       
       
       Luta UEC01 = new Luta();
       UEC01.marcarLuta(l[1], l[4]);
       UEC01.lutar();
    }
    //shghyjyjy
}
