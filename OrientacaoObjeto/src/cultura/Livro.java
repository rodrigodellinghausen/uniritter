package cultura;

/**
 *
 * @author Rodrigo
 */
public class Livro {

    private String ISBN;
    private String titulo;
    private Artista[] autores;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Artista[] getAutores() {
        return autores;
    }

    public void setAutores(Artista[] autores) {
        this.autores = autores;
    }
    
    
}
