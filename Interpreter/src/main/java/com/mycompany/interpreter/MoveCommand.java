package com.mycompany.interpreter;
/**
 * Clase que implementa la interfaz ComandoExpresion para representar el comando de mover el robot hacia adelante.
 */
public class MoveCommand implements ComandoExpresion {
    /**
     * Implementación del método interpret de la interfaz ComandoExpresion.
     * Imprime un mensaje indicando que el robot se está moviendo hacia adelante.
     *
     * @param contexto El contexto del robot en el que se ejecutará el comando.
     */
    @Override
    public void interpret(ContextoRobot contexto) {
        System.out.println("Moviendo el robot hacia adelante");
    }
}
