/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Objects;

/**
 *
 * @author Windows10
 */
public class Modulo {
    private String inicial;
    private String desacripcion;

    public Modulo() {
    }

    public String getInicial() {
        return inicial;
    }

    public void setInicial(String inicial) {
        this.inicial = inicial;
    }

    public String getDesacripcion() {
        return desacripcion;
    }

    public void setDesacripcion(String desacripcion) {
        this.desacripcion = desacripcion;
    }

    @Override
    public String toString() {
        return  inicial + ";" + desacripcion ;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.inicial);
        hash = 19 * hash + Objects.hashCode(this.desacripcion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Modulo other = (Modulo) obj;
        if (!Objects.equals(this.inicial, other.inicial)) {
            return false;
        }
        if (!Objects.equals(this.desacripcion, other.desacripcion)) {
            return false;
        }
        return true;
    }
    
    
    
}
