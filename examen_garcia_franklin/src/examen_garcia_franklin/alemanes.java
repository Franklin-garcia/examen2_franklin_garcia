/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_garcia_franklin;

import java.io.Serializable;

/**
 *
 * @author Franklin Garcia
 */
public class alemanes implements Serializable{
    private static final long SerialVersionUID=778L;
       private String alias;
       private int edad;
       private String casta;
       private int resistencia;
       private String tipo_arma;

    public alemanes() {
    }

    public alemanes(String alias, int edad, String casta, int resistencia, String tipo_arma) {
        this.alias = alias;
        this.edad = edad;
        this.casta = casta;
        this.resistencia = resistencia;
        this.tipo_arma = tipo_arma;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCasta() {
        return casta;
    }

    public void setCasta(String casta) {
        this.casta = casta;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public String getTipo_arma() {
        return tipo_arma;
    }

    public void setTipo_arma(String tipo_arma) {
        this.tipo_arma = tipo_arma;
    }

    @Override
    public String toString() {
        return alias;
    }
       
}
