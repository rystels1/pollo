/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.pollo.entities;

import java.util.Date;

/**
 *
 * @author ryst2
 */
public class Comentario {

    private String user;
    private String desctipcion;
    private Date fecha;
    
    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the desctipcion
     */
    public String getDesctipcion() {
        return desctipcion;
    }

    /**
     * @param desctipcion the desctipcion to set
     */
    public void setDesctipcion(String desctipcion) {
        this.desctipcion = desctipcion;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}
