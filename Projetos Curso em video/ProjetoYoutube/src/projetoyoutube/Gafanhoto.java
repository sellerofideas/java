package projetoyoutube;
public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

   public Gafanhoto(String nome, int idade, String sexo, String login){
       super(nome, idade, sexo);
       this.login = login;
       this.totAssistido = 0;
   }
    
    
    public void viuMaisUm(){
        this.totAssistido++;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString()+ "\nlogin=" + login + 
                ", totAssistido=" + totAssistido + '}';
    }
    
}
