package publicação;
public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa [2];
        Livro[] l = new Livro[2];
        
        p[0] = new Pessoa("Pedro", "M", 22);
        
        l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]); 
        
        System.out.println(l[0].detalhes());
    }
      
}

