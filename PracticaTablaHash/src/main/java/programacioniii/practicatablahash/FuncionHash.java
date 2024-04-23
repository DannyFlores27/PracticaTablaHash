
package programacioniii.practicatablahash;

public class FuncionHash {
    private int tamanoTabla;

    public FuncionHash(int tamanoTabla) {
        this.tamanoTabla = tamanoTabla;
    }

    // Método para calcular el índice usando el código ASCII
    public int calcularIndice(int codigoAscii) {
        return codigoAscii % tamanoTabla;
    }
}
