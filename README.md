## Introducción
La `TablaHash` es una estructura de datos implementada en Java que proporciona una forma eficiente de almacenar y recuperar elementos asociados a claves únicas. Esta implementación utiliza una función hash para calcular el índice de almacenamiento de cada elemento, lo que permite un acceso rápido a los elementos en la tabla.

## Funcionalidades
La implementación de la `TablaHash` proporciona las siguientes funcionalidades:

1. **Agregar Persona**: Permite agregar una nueva persona a la tabla hash, asociándola con una clave única (el primer carácter de su nombre).
2. **Buscar Persona**: Permite buscar una persona en la tabla hash utilizando su nombre como clave.
3. **Crear TablaHash**: Crea una instancia de la tabla hash con un tamaño específico.

## Uso Básico
### Crear una TablaHash
```java
TablaHash tablaHash = new TablaHash(10);
