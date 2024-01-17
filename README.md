## Explicación y compilación
# Memento
El patrón Memento se utiliza para permitir que un objeto sea restaurado a un estado anterior sin revelar detalles internos de su implementación.
# Código
Este código simula checkpoints de un videojuego, estos se van guardando en una lista que "CareTaker" controla, haciendo uso de "Originator".
Para agregar un nuevo checkpoint, basta con crear una instancia del juego, guardar el checkpoint en la posición disponible de la lista y confirmar el cambio. Igualmente podemos hacer un rollback del checkpoint deseado De esta forma se ve en código.
```java
juego = new Juego();
juego.setNombre(nombreJuego);
juego.setCheckpoint(6);
        
originator.setEstado(juego);
caretaker.addMemento(originator.guardar());
        
originator.setEstado(juego);
```
# Salida
```java
Juego [nombre = Mario Bros, checkpoint = 5]
```
# Abstract Factory
En el código definen interfaces para los productos (Procesador y RAM), implementaciones concretas para estos productos tanto para computadoras de escritorio como para laptops, y se utilizan fábricas abstractas (ComputadoraFactory) junto con sus implementaciones concretas (ComputadoraEscritorioFactory y ComputadoraLaptopFactory) para crear familias de productos coherentes. El programa principal (Cliente) utiliza estas fábricas para crear y mostrar configuraciones de computadoras de escritorio y laptops de manera modular y desacoplada.
# Salida
```java
Configuración de computadora de escritorio:
Procesador de escritorio
RAM de escritorio (32 GB)

Configuración de laptop:
Procesador de laptop
RAM de laptop (16 GB)
```
# Interpreter
El programa Interpreter implementa el patrón de diseño Interpreter, que se utiliza para interpretar y ejecutar comandos específicos en el contexto de un robot. Utiliza una serie de clases para representar comandos individuales como girar a la izquierda (LeftCommand), girar a la derecha (RightCommand), y mover hacia adelante (MoveCommand). Además, introduce una expresión no terminal llamada RepetirComando que permite repetir un comando específico varias veces.
# Salida
```java
Girando el robot a la izquierda
Girando el robot a la izquierda
```
# Strategy
Este programa implementa una calculadora utilizando el patrón de diseño Strategy. La calculadora puede realizar diversas operaciones matemáticas (suma, resta, multiplicación) de manera dinámica y flexible sin modificar su código. Se utilizan estrategias concretas para representar cada operación, permitiendo cambiar la estrategia de la calculadora en tiempo de ejecución. 
# Salida
```java
Resultado de la suma: 8
Resultado de la resta: 2
Resultado de la multiplicación: 15
```
# FlyWeight
Este programa simula un escenario de juego donde hay diferentes tipos de árboles. Utiliza el patrón de diseño Flyweight para optimizar la gestión de instancias de árboles compartiendo eficientemente el estado intrínseco común, que en este caso es la imagen del árbol. A través de la Factoría Flyweight, el programa crea instancias compartidas de tipos de árboles y las utiliza para dibujar árboles con diferentes colores.
# Salida
```java
Dibujando Pino de color verde con imagen: pino.png
Dibujando Roble de color marrón con imagen: roble.png
Dibujando Pino de color azul con imagen: pino.png
```
