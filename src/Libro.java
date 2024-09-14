public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isDisponible() {
        return disponible;
    }

    private void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void prestar() {
        if (disponible) {
            setDisponible(false);
            System.out.println("Libro prestado.");
        } else {
            System.out.println("El libro no está disponible.");
        }
    }

    public void devolver() {
        setDisponible(true);
        System.out.println("Libro devuelto.");
    }
}

