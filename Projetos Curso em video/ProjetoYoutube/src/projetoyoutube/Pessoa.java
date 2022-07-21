package projetoyoutube;
public abstract class Pessoa {
    protected String nome;
    protected String sexo;
    protected int idade;
    protected int experiencia;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.experiencia = 0;
    }
    
    
    protected void ganharExp(){
        this.experiencia++;
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
        return "Pessoa{" + "nome=" + nome + ", sexo=" + sexo +
                ", idade=" + idade + ", experiencia=" + experiencia + '}';
    }
    
}
