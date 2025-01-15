
package programacioniii.practicatablahash;

public class Persona {
    private String nombre;
    private int edad;
    private int mayorEdad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // Método para obtener el código ASCII de la primera letra del nombre
    public int obtenerCodigoAscii() {
        if (nombre.length() > 0) {
            return (int) nombre.charAt(0);
        }
        return -1; // Retorna -1 si el nombre está vacío
    }
}
