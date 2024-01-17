package com.mycompany.interpreter;
/**
 * Clase que implementa la interfaz ComandoExpresion para representar un comando que repite otro comando varias veces.
 */
public class RepetirComando implements ComandoExpresion {
    private ComandoExpresion comando;
    private int repeticiones;
    /**
     * Constructor que inicializa un objeto RepetirComando con el comando a repetir y el número de repeticiones.
     *
     * @param comando El comando a repetir.
     * @param repeticiones El número de repeticiones.
     */
    public RepetirComando(ComandoExpresion comando, int repeticiones) {
        this.comando = comando;
        this.repeticiones = repeticiones;
    }
    /**
     * Implementación del método interpret de la interfaz ComandoExpresion.
     * Repite el comando especificado el número de veces indicado en el constructor.
     *
     * @param contexto El contexto del robot en el que se ejecutará el comando.
     */
    @Override
    public void interpret(ContextoRobot contexto) {
        for (int i = 0; i < repeticiones; i++) {
            comando.interpret(contexto);
        }
    }
}