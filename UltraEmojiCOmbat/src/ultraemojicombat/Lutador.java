package ultraemojicombat;
public final class Lutador {
 //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    Lutador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Metodos publicos
    public void apresentar(){
        System.out.println("CHEGOU AHORA DE APRESENTARMOS O LUTADOR DA NOITE! ");
        System.out.println("DIRETAMENTE DE "+ this.getNacionalidade());
        System.out.println("COM "+ this.getIdade()+ " Anos de idade!");
        System.out.println("E "+ this.getAltura()+ " De altura");
        System.out.println("Pesando " + this.getPeso()+ " Kg");
        System.out.println("Ganhou "+ this.getVitorias()+ " Lutas");
        System.out.println("Com "+ this.getDerrotas()+ " derrotas em sua carreira");
        System.out.println("E "+ this.getEmpates()+ " empates!");
        System.out.println("É ELEEEE! O GRANDE "+ this.getNome());
    }
    public void status(){
        System.out.println("---------------------------------------------");
        System.out.println(this.getNome()+ " é um "+ this.getCategoria());
        System.out.println(this.getVitorias()+ " Vitorias");
        System.out.println(this.getDerrotas() + " Derrotoas");
        System.out.println(this.getEmpates() + " Empates");
        
    }
    public void ganhar(){
        this.setVitorias(this.getVitorias()+ 1);
     }
    public void perder(){
        this.setDerrotas(this.getDerrotas()+ 1);
    }
    public void empatar(){
        this.setEmpates(this.getEmpates()+ 1);
    }
    
    
    //Metotos Especiais
    public Lutador(String no, String na, int id, float al,
                   float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi; 
        this.derrotas = de;
        this.empates = em;
        

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
        
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso <=52.2){
            this.categoria = "Invalido";
        }else if(this.peso <= 70.3){
            this.categoria = "Peso Leve";
        }else if(this.peso <=83.9){
            this.categoria = "Peso Médio";
        }else if(this.peso <= 120.2){
            this.categoria = "Peso pesado";
        }else{
            this.categoria = " Categoria Inválida!";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
     
}
