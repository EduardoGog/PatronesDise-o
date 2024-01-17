package com.mycompany.pmemento;
public class Originator {
    /*Esta clase sabe como guardar el objeto*/
    /*Atributo juego llamado estado*/
    private Juego estado;
    
    /*Getter y setter para guardar estado de juego*/
    public void setEstado(Juego estado)
    {
        this.estado = estado;
    }
    
    public Juego getEstado()
    {
        return estado;
    }
    
    /*Cuando se guarda se crea una nueva instancia de objeto Memento
    con el estado a guardar*/
    /*Uso de Memento para guardar el estado*/
    /*Se retorna una nueva instancia*/
    public Memento guardar()
    {
        return new Memento(estado);
    }
    
    public void restaurar(Memento m)
    {
        this.estado = m.getEstado();
    }
}
