package publicação;
public class Livro implements Publicacao {
    private String titulo, autor;
    private int totpaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor +
                "\n totpaginas=" + totpaginas + ", pagAtual=" + pagAtual + ","
                + "\n aberto=" + aberto + ", leitor=" + leitor.getNome() + 
                "\n leitor=" + leitor.getIdade() +
                " leitor=" + leitor.getSexo() +'}';
    }
    public Livro(String titulo, String autor, int totpaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totpaginas = totpaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotpaginas() {
        return totpaginas;
    }

    public void setTotpaginas(int totpaginas) {
        this.totpaginas = totpaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    public void folear(int p) {
        this.pagAtual = p;
    }

    public void avancarPag() {
        this.pagAtual ++;

    }

    @Override
    public void voltarPag() {
       this.pagAtual --;

    }

    @Override
    public void folear() {
    }

    @Override
    public void avancarPag(int p) {
    }

    
    
        
        
        
    }

    