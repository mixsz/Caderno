public class Livro {
   private String titulo, autor;
   private int anoPublicacao;
   private int id;
   public static int idProx = 1;

    public Livro(String titulo, String autor, int anoPublicacao) {
    this.titulo = titulo;
    this.autor = autor;
    this.anoPublicacao = anoPublicacao;
    this.id = idProx++;
    }


    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public int getId() {
        return id;
    }
    public static int getIdProx() {
        return idProx;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    public void setId(int id) {
        this.id = id;
    }
    public static void setIdProx(int idProx) {
        Livro.idProx = idProx;
    }

   
}
