/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Windows10
 */
public class RegistroJSON {
     @JsonProperty("Alumno/a") 
    public String alumnoA;
    @JsonProperty("OACV") 
    public String oACV;
    @JsonProperty("EA") 
    public  String eA;
    @JsonProperty("TII") 
    public  String tII;
    @JsonProperty("TC") 
    public  String tC;
    @JsonProperty("ING") 
    public  String iNG;
    @JsonProperty("FOL") 
    public  String fOL;
    @JsonProperty("CEAC") 
    public  String cEAC;

    public String getAlumnoA() {
        return alumnoA;
    }

    public void setAlumnoA(String alumnoA) {
        this.alumnoA = alumnoA;
    }

    public String getoACV() {
        return oACV;
    }

    public void setoACV(String oACV) {
        this.oACV = oACV;
    }

    public String geteA() {
        return eA;
    }

    public void seteA(String eA) {
        this.eA = eA;
    }

    public String gettII() {
        return tII;
    }

    public void settII(String tII) {
        this.tII = tII;
    }

    public String gettC() {
        return tC;
    }

    public void settC(String tC) {
        this.tC = tC;
    }

    public String getiNG() {
        return iNG;
    }

    public void setiNG(String iNG) {
        this.iNG = iNG;
    }

    public String getfOL() {
        return fOL;
    }

    public void setfOL(String fOL) {
        this.fOL = fOL;
    }

    public String getcEAC() {
        return cEAC;
    }

    public void setcEAC(String cEAC) {
        this.cEAC = cEAC;
    }

    @Override
    public String toString() {
        return "Alumno{" + "alumnoA=" + alumnoA + ", oACV=" + oACV + ", eA=" + eA + ", tII=" + tII + ", tC=" + tC + ", iNG=" + iNG + ", fOL=" + fOL + ", cEAC=" + cEAC + '}';
    }
    
    
    
}
