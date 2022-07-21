package tabuleiro;
public final class Profissoes {
 //Atributos
    private String profissao, cor;
    private double salario, extra;
    private final boolean emprego;

    public Profissoes(String profissao, String cor, double salario, 
                                double RExtra, boolean empregado) {
        this.profissao = profissao;
        this.cor = cor;
        this.salario = salario;
        this.extra = extra;
        this.emprego = true;
    }
    //Metotos Especiais
     public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
   

    //Metodos publicos
    public void status(){
        System.out.println("Profissão: "+ this.getProfissao());
        System.out.println("Salario: "+this.getSalario());
        System.out.println("Empregado: "+ this.getEmprego());
        //System.out.println("Renda extra: " + this.getExtra());
    }
    public void salario(){
        if(this.emprego == true){
        this.salario = salario++;
        }
    }
    public void rendaExtra(){
        this.extra = this.extra++;
    }
    
    public void comprar(){
    }
    public void alugar(){
    }
    public void emprestar(){
        
    }
    private void desempregado(){
        if(this.emprego == false){
            System.out.println("DESEMPREGADO!");
        }else
            System.out.println("EMPREGADO!");

    }
    public void aumentoSalario(){
        if(this.emprego == true){
        //this.salario + (5%);
        }
    }

    private boolean getEmprego() {
        return this.emprego;
    }
    private void getExtra() {
        this.getExtra();
    }
}
