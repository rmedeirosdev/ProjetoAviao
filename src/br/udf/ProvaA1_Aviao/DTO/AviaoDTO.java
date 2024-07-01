/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udf.ProvaA1_Aviao.DTO;

/**
 *
 * @author rapha
 */
public class AviaoDTO {
    
    private long aviID;
    private String aviFabricante;
    private String aviModelo;
    
    
    public long getAviID() {
        return aviID;
    }

    public void setAviID(long aviID) {
        this.aviID = aviID;
    }

    public String getAviFabricante() {
        return aviFabricante;
    }

    public void setAviFabricante(String aviFabricante) {
        this.aviFabricante = aviFabricante;
    }

    public String getAviModelo() {
        return aviModelo;
    }

    public void setAviModelo(String aviModelo) {
        this.aviModelo = aviModelo;
    }
 
}
