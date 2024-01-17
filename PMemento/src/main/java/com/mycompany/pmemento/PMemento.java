package com.mycompany.pmemento;
public class PMemento {

    public static void main(String[] args) {
        String nombreJuego = "Mario Bros";
        /*Instancia objeto juego*/
        /*objeto juego que es instanciado con atributos*/
        /*nombre y checkpoint*/
        
        Juego juego = new Juego();
        juego.setNombre(nombreJuego);
        juego.setCheckpoint(1);
        
        /*Instancia de clase Caretaker*/
        /*Aqui almacenaremos todos los checkpoints de juego*/
        Caretaker caretaker = new Caretaker();
        
        /*Instancia de clase originator*/
        /*Objeto responsable de guardar estado de objeto en cierto punto*/
        Originator originator = new Originator();
        
        /*Nueva instancia para indicar un avance en juego*/
        juego = new Juego();
        juego.setNombre(nombreJuego);
        juego.setCheckpoint(2);
        /*Originator guardara estado hasta este punto*/
        originator.setEstado(juego);
        
        juego = new Juego();
        juego.setNombre(nombreJuego);
        juego.setCheckpoint(3);
        /*Nuevo estado en la clase Originator*/
        originator.setEstado(juego);
        /*Guardamos en la lista addMemento a través de originator*/
        /*Con la instancia retornada en Origintator*/
        /*Confirmacion de cambio que retornara objeto de tipo juego
        que será almacenado en addMemento*/
        caretaker.addMemento(originator.guardar()); /*Primer estado
        guardado en la posicion 0*/
        
        juego = new Juego();
        juego.setNombre(nombreJuego);
        juego.setCheckpoint(4);
        
        originator.setEstado(juego);
        caretaker.addMemento(originator.guardar());/*Nuevo
        estado en posicion 1*/
        
        juego = new Juego();
        juego.setNombre(nombreJuego);
        juego.setCheckpoint(5);
        
        originator.setEstado(juego);
        caretaker.addMemento(originator.guardar());
        
        /*juego = new Juego();
        juego.setNombre(nombreJuego);
        juego.setCheckpoint(6);
        
        originator.setEstado(juego);
        caretaker.addMemento(originator.guardar());
        
        originator.setEstado(juego);*/
        /*Restaurar a un checkpoint de la lista, según la posición*/
        /*rollback a través de un punto establecido*/
        
        originator.restaurar(caretaker.getMemento(2));
        
        juego = originator.getEstado();
        System.out.println(juego);
        
    }
}
