public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Juan", "Pérez");
        Bibliotecario bibliotecario = new Bibliotecario("Ana", "Gómez");
        Libro libro = new Libro("1984", "George Orwell", "12345");

        usuario.mostrarDatos();
        bibliotecario.mostrarDatos();
        bibliotecario.prestar(libro, usuario);
        libro.devolver();
    }
}
