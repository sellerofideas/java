package escola;
public class Escola {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Claudio");
        v1.setIdade(18);
        v1.setSexo("M");
        System.out.println(v1.toString()); 
       
        
        Aluno a1 = new Aluno();
        a1.setNome("Carlos");
        a1.setCurso("Informatica");
        a1.setIdade(19);
        a1.setSexo("M");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Jubileu");
        b1.setMatricula(1121);
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();  
        
        Professor p1 = new Professor();
        p1.setNome("Geraldo");
        p1.receberAumento();
        
        Tecnico t1 = new Tecnico();
        t1.setNome("Rubens");
        t1.pagarMensalidade();
        t1.praticar();
    }
    
}
