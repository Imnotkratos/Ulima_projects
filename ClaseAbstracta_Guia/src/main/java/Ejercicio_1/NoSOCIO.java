/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_1;

/**
 *
 * @author Usuario
 */
public class NoSOCIO extends Persona {
    
    
    public NoSOCIO(){
        super();
    }

    public NoSOCIO(String nombre, int dni, String mPago, double monto_total) {
        super(nombre, dni, mPago, monto_total);
    }
    
    
 

    @Override
    public String toString(){
        return  "No Socio{"+"Nombre: "+ this.nombre + "//" +"DNI: " +this.dni+"}"; 
    }
    
    @Override
    public double noSocio(int entradas){
        double montoT = 0;
        if(entradas == 1){
            montoT = this.monto_total + 250;
            System.out.println("La entrada está 250");
            System.out.println("El monto total es: " + montoT);
        }else if(entradas>=2 && entradas <= 6){
            montoT = this.monto_total + 150;
            System.out.println("Tu entrada está 150");
            System.out.println("El monto total es: " + montoT);
        }else if(entradas > 6){
            montoT = this.monto_total + 100;
            System.out.println("Tu entrada está 100");
            System.out.println("El monto total es: " + montoT);
        }
        return montoT;
    }
    
    @Override
    public double Socio(int tiempo){
        return 0;
    }
}
