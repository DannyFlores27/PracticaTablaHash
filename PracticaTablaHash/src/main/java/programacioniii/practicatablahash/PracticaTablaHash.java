
package programacioniii.practicatablahash;

public class PracticaTablaHash {

    public static void main(String[] args) {
        // Crear una instancia de TablaHash
        TablaHash tablaHash = new TablaHash(10);

        // Agregar algunas personas a la tabla hash
        tablaHash.agregarPersona(new Persona("Alex", 25));
        tablaHash.agregarPersona(new Persona("Yoshi", 30));
        tablaHash.agregarPersona(new Persona("Jimena", 20));

        // Buscar una persona por nombre
        Persona personaEncontrada = tablaHash.buscarPersona("Yoshi");
        if (personaEncontrada != null) {
            System.out.println("Persona encontrada: " + personaEncontrada.getNombre() + ", Edad: " + personaEncontrada.getEdad());
        } else {
            System.out.println("Persona no encontrada.");
        }
    }
}
