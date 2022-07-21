package projetopessoas;
public class ProjetoPessoas {
    public static void main(String[] args) {
         
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Juca");
        p2.setNome("Tico");
        p3.setNome("Jão");
        p4.setNome("Jidio");
        
        p1.setSexo("M");
        p2.setSexo("F");
        p3.setSexo("F");
        p4.setSexo("M");
        
        p1.setIdade(25);
        p2.setIdade(26);
        p3.setIdade(26);
        p4.setIdade(35);
        
        p2.setCurso("Tatuagem");
        p3.setSalario(3.500f);
        p4.setSetor("Finanças");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
    
}
