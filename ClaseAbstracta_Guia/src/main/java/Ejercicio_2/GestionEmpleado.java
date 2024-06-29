/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2;

/**
 *
 * @author Usuario
 */
public class GestionEmpleado {
    public static void main(String[] args) {
        //Prueba programador
        Empleado p1 = new Programador("Stefano",1200,"Casa","Backend developer",3);
        System.out.println("Datos del programador: " + p1.toString());
        p1.programador();
        
        //Prueba electronico
        Empleado e1 = new Electronico("Sebastian",1200,"Casa",4);
        System.out.println("Datos del electronico: " + e1.toString());
        e1.electronico();
        
        //Prueba administrador (Considerar tildes y espacios)
        Empleado a1 = new Admin("Fiorella",1200,"Casa","Secretaria");
        System.out.println("Datos de la admin: " + a1.toString());
        a1.admin();
    }
}
