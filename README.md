Manual de Usuario: TablaHash
Introducción
La TablaHash es una estructura de datos implementada en Java que proporciona una forma eficiente de almacenar y recuperar elementos asociados a claves únicas. Esta implementación utiliza una función hash para calcular el índice de almacenamiento de cada elemento, lo que permite un acceso rápido a los elementos en la tabla.

Funcionalidades
La implementación de la TablaHash proporciona las siguientes funcionalidades:

Agregar Persona: Permite agregar una nueva persona a la tabla hash, asociándola con una clave única (el primer carácter de su nombre).
Buscar Persona: Permite buscar una persona en la tabla hash utilizando su nombre como clave.
Crear TablaHash: Crea una instancia de la tabla hash con un tamaño específico.
Uso Básico
Crear una TablaHash
java
Copy code
TablaHash tablaHash = new TablaHash(10);
Este comando crea una nueva tabla hash con un tamaño inicial de 10.

Agregar Persona
java
Copy code
tablaHash.agregarPersona(new Persona("Juan", 25));
Este comando agrega una nueva persona a la tabla hash. La persona se asociará con la clave única generada a partir del primer carácter de su nombre.

Buscar Persona
java
Copy code
Persona personaEncontrada = tablaHash.buscarPersona("María");
Este comando busca una persona en la tabla hash utilizando su nombre como clave. Si la persona se encuentra, se devuelve su instancia; de lo contrario, se devuelve null.

Ejemplo de Uso (Main)
El siguiente código muestra un ejemplo de cómo usar la TablaHash:

public class PracticaTablaHash {
    public static void main(String[] args) {
        TablaHash tablaHash = new TablaHash(10);

        tablaHash.agregarPersona(new Persona("Alex", 25));
        tablaHash.agregarPersona(new Persona("Yoshi", 30));
        tablaHash.agregarPersona(new Persona("Jimena", 20));

        Persona personaEncontrada = tablaHash.buscarPersona("Alex");
        if (personaEncontrada != null) {
            System.out.println("Persona encontrada: " + personaEncontrada.getNombre() + ", Edad: " + personaEncontrada.getEdad());
        } else {
            System.out.println("Persona no encontrada.");
        }
    }
}
Este código crea una tabla hash, agrega algunas personas y luego busca una persona por su nombre. Finalmente, imprime la información de la persona encontrada, si existe.
