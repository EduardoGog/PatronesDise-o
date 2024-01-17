package com.mycompany.pmemento;
public class Memento {
    private Juego estado;
    
    /*Constructor que recibe al objeto juego*/
    /*Para guardarlo en la variable*/
    public Memento(Juego estado)
    {
        this.estado = estado;
    }
    
    /*Get para poder recuperarlo posteriormente*/
    public Juego getEstado()
    {
        return estado;
    }
}
