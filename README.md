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
        
originator.setEstado(juego);*/
```
