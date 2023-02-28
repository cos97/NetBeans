/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopr_qeq;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Players {
    
    private String iniciales;
    private double puntuacion;

    public Players(String iniciales, double puntuacion) {
        this.iniciales = iniciales;
        this.puntuacion = puntuacion;
    }

    public Players() {
        iniciales = "";
        puntuacion = 0;
    }

    public String getIniciales() {
        return iniciales;
    }

    //de los metodos que preguntan y convierten nombres a iniciales
    public void setIniciales(String iniciales) {
        this.iniciales = iniciales;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }
    
    //Convierte nombre en iniciales
    public void preguntaNombre(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce su nombre completo");
        String [] o = sc.nextLine().split(" ");
        //del metodo siguiente
        iniciales = printIniciales(o);
}
    public static String printIniciales(String[]o){
        String result = "";
        for (String s : o){
            result += s.toUpperCase().charAt(0);
        }
        return result;
    }
    
    
    
    @Override
    public String toString() {
        return "Players{" + "iniciales=" + iniciales + ", puntuacion=" + puntuacion + '}';
    }
    
    
    
}
