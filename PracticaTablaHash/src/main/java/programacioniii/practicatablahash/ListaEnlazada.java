
package programacioniii.practicatablahash;

public class ListaEnlazada {
    private Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }

    // Método para agregar un elemento a la lista enlazada
    public void agregar(Persona persona) {
        Nodo nuevoNodo = new Nodo(persona);
        nuevoNodo.setSiguiente(cabeza);
        cabeza = nuevoNodo;
    }

    // Método para buscar una persona en la lista enlazada
    public Persona buscar(String nombre) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.getPersona().getNombre().equals(nombre)) {
                return actual.getPersona();
            }
            actual = actual.getSiguiente();
        }
        return null;
    }
}
