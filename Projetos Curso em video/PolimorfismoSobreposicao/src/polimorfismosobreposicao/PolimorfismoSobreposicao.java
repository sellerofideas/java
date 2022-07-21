package polimorfismosobreposicao;
public class PolimorfismoSobreposicao {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra s = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish pd = new GoldFish();
        Arara ar = new Arara();
        
        /*System.out.println("Mamífero");
        m.locomover();
        System.out.println(" ");
        System.out.println("Réptil");
        r.locomover();
        System.out.println(" ");
        System.out.println("Peixe");
        p.locomover();
        System.out.println(" ");
        System.out.println("Ave");
        a.locomover();*/
        
        c.setNome("Canguru Guru");
        c.nome();
        c.locomover();
        c.poderEspecial();
        
        k.setNome("Cão Caramelo");
        k.nome();
        k.locomover();
        k.poderEspecial();
        
        s.setNome("Cobra Celeste");
        s.nome();
        s.locomover();
        s.poderEspecial();
        
        t.setNome("Tartaruga Tuga");
        t.nome();
        t.locomover();
        t.poderEspecial();
        
        pd.setNome("Peixinho dourado Peixoto");
        pd.nome();
        pd.locomover();
        pd.poderEspecial();
        
        ar.setNome("Arara Quara");
        ar.nome();
        ar.locomover();
        ar.poderEspecial();
    }
    
}
