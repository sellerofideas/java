package projetopessoas;
public class Professor extends Pessoa{
    private String especialIdade;
    private float salario;
    
    public void receberAumento (float aum){
        this.salario += aum;
    }

    public String getEspecialIdade() {
        return especialIdade;
    }

    public void setEspecialIdade(String especialIdade) {
        this.especialIdade = especialIdade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
