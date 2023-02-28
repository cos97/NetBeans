/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopr_qeq;

/**
 *
 * @author Usuario
 */
public class Personajes {
     private String nombre;
    
    private boolean femenino;
    
    private boolean correcto;
    
    private boolean peloAzul;
    
    private boolean peloCalvete;
    
    private boolean joven;
    
    private boolean famoso;
  
    public Personajes() {
        
    }

    public Personajes(String nombre, boolean femenino, boolean peloAzul, boolean peloCalvete, boolean joven, boolean famoso) {
        this.nombre = nombre;
        this.femenino = femenino;
        this.peloAzul = peloAzul;
        this.peloCalvete = peloCalvete;
        this.joven = joven;
        this.famoso = famoso;
    }
    
    public Personajes(Personajes b){
        
    }

    public boolean isFemenino() {
        return femenino;
    }

    public boolean isCorrecto() {
        return correcto;
    }

    public boolean isPeloAzul() {
        return peloAzul;
    }

    public boolean isPeloCalvete() {
        return peloCalvete;
    }

    public boolean isJoven() {
        return joven;
    }

    public boolean isFamoso() {
        return famoso;
    }

   

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Personajes{" + "nombre=" + nombre + ", femenino=" + femenino + ", correcto=" + correcto + ", peloAzul=" + peloAzul + ", peloCalvete=" + peloCalvete + ", joven=" + joven + ", famoso=" + famoso + '}';
    }
    
     
    
    
     
    public String calcula(){
        if (femenino==false && peloAzul==false && peloCalvete==false && joven==true && famoso==false) {
            return "Bart";
        }else if(femenino==true && peloAzul==false && peloCalvete==false && joven==true && famoso==false){
            return "Lisa";
        }else if(femenino==false && peloAzul==false && peloCalvete==true && joven==false && famoso==false){
            return "Homer";
        }else if(femenino==true && peloAzul==true && peloCalvete==false && joven==false && famoso==false){
            return "Marge";
        }else if(femenino==false && peloAzul==true && peloCalvete==false && joven==true && famoso==false){
            return "Milhouse";
        }else if(femenino==false && peloAzul==false && peloCalvete==true && joven==false && famoso==true){
            return "El Sr Barns";
        }else if(femenino==false && peloAzul==true && peloCalvete==false && joven==false && famoso==true){
            return "El payaso Krasty";
        }else if(femenino==false && peloAzul==false && peloCalvete==false && joven==false && famoso==true){
            return "Troy McClure, tal vez le recuerden de pelÃ­culas como Danza con bobos, Â¡AquÃ­ Llega el Sistema MÃ©trico! o Pintura con Plomo: Deliciosa Pero Mortal";
        }else return "Son las gemelas";
    }
    
    
    
    public String preguntaPeloAzul(){
        return "¿Tiene el pelo de color azul?";
}
    public String preguntaPeloCalvo(){
        return "¿Tiene poco pelo?";
}
    public String preguntaFemenino(){
        return "¿Es una mujer?";
}
    public String preguntaJoven(){
        return "¿Es joven?";
}
    public String preguntaFamoso(){
        return "¿Es famoso?";
}
    
    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFemenino(boolean femenino) {
        this.femenino = femenino;
    }

    public void setPeloAzul(boolean peloAzul) {
        this.peloAzul = peloAzul;
    }

    public void setPeloCalvete(boolean peloCalvete) {
        this.peloCalvete = peloCalvete;
    }

    public void setJoven(boolean joven) {
        this.joven = joven;
    }

    public void setFamoso(boolean famoso) {
        this.famoso = famoso;
    }
}

