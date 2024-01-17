package com.mycompany.interpreter;
/**
 * Interfaz que define el contrato para las expresiones de comandos en el patrón Interpreter.
 * Cada implementación de esta interfaz debe proporcionar la lógica para interpretar y ejecutar un comando.
 */
public interface ComandoExpresion {
    /**
     * Método que interpreta y ejecuta el comando en el contexto proporcionado.
     *
     * @param contexto El contexto del robot en el que se ejecutará el comando.
     */
    void interpret(ContextoRobot contexto);
}
