package lab9p1_luishenriquez;

public class Libro {

    private String titulo;
    private String autor;
    private String genero;
    private int edad;
    private Libro help;

    public Libro(String titulo, String autor, String genero, int edad) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.edad = edad;
       
    }

    public Libro getHelp() {
        return help;
    }

    public void setHelp(Libro help) {
        this.help = help;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + ", edad=" + edad + '}';
    }
    
     
    
    
    
}
