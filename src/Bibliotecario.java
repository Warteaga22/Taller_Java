public class Bibliotecario extends Persona implements Gestionable {
    private int prestamosActuales = 0;
    private final int MAX_PRESTAMOS = 3;

    public Bibliotecario(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Bibliotecario: " + nombre + " " + apellido);
    }

    public void prestar(Libro libro, Usuario usuario) {
        if (prestamosActuales < MAX_PRESTAMOS && libro.isDisponible()) {
            libro.prestar();
            prestamosActuales++;
            System.out.println("Libro prestado a " + usuario.nombre);
        } else {
            System.out.println("No se puede prestar el libro.");
        }
    }

    @Override
    public void prestarLibro() {
        // Implementación
    }

    @Override
    public void devolverLibro() {
        // Implementación
    }
}
