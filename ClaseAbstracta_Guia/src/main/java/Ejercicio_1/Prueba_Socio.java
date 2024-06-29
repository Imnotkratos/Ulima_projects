/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_1;

/**
 *
 * @author Usuario
 */
public class Prueba_Socio {
    public static void main(String[] args) {
    Persona p1 = new SOCIO("Stefano",123,"Tarjeta",1200,1234);
    Persona p2 = new NoSOCIO("Stefano",123,"Tarjeta",1200);
    System.out.println("Datos del socio: " + p1.toString());
    p1.Socio(4);
    System.out.println("#####################################################");
    System.out.println("Datos del No socio: " + p2.toString());
    p2.noSocio(1);
    
    
    
    }
}
