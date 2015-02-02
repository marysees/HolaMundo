package com.example.tarde.fragmentos;

import java.io.Serializable;

/**
 * Created by tarde on 02/02/2015.
 */

//La clase tiene que ser serializable para poder usarse en varios fragmentos para poder enviar el objeto a nuevas actividades
public class CorreoElectronico implements Serializable{


    private String remitente;
    private String asunto;
    private String contenido;

    @Override
    public String toString() {
        return "CorreoElectronico{" +
                "remitente='" + remitente + '\'' +
                ", asunto='" + asunto + '\'' +
                '}';
    }



    public CorreoElectronico(String asunto, String remitente, String contenido) {
        this.asunto = asunto;
        this.remitente = remitente;
        this.contenido = contenido;
    }


    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public CorreoElectronico(String remitente) {
        this.remitente = remitente;
    }


}
