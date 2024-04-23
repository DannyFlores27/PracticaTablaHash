
package programacioniii.practicatablahash;

public class TablaHash {
    private ListaEnlazada[] tabla;
    private FuncionHash funcionHash;

    public TablaHash(int tamano) {
        tabla = new ListaEnlazada[tamano];
        for (int i = 0; i < tamano; i++) {
            tabla[i] = new ListaEnlazada();
        }
        funcionHash = new FuncionHash(tamano);
    }

    // Método para agregar una persona a la tabla hash
    public void agregarPersona(Persona persona) {
        int indice = funcionHash.calcularIndice(persona.obtenerCodigoAscii());
        tabla[indice].agregar(persona);
    }

    // Método para buscar una persona por nombre en la tabla hash
    public Persona buscarPersona(String nombre) {
        int codigoAscii = (int) nombre.charAt(0);
        int indice = funcionHash.calcularIndice(codigoAscii);
        return tabla[indice].buscar(nombre);
    }
}
