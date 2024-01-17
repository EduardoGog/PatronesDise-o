package com.mycompany.interpreter;
/**
 * Clase que implementa la interfaz ComandoExpresion para representar el comando de girar el robot a la izquierda.
 */
public class LeftCommand implements ComandoExpresion {
    /**
     * Implementación del método interpret de la interfaz ComandoExpresion.
     * Imprime un mensaje indicando que el robot se está girando a la izquierda.
     *
     * @param contexto El contexto del robot en el que se ejecutará el comando.
     */
    @Override
    public void interpret(ContextoRobot contexto) {
        System.out.println("Girando el robot a la izquierda");
    }
}
