/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gera.primero;

/**
 *
 * @author humbe
 */
public class Estatusexamen {
     private String mensaje;
    private boolean success;
public Estatusexamen() {
    }

    public Estatusexamen(String mensaje, boolean success) {
        this.mensaje = mensaje;
        this.success = success;
    }
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

}
