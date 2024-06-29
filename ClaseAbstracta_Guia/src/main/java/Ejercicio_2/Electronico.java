/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2;

public class Electronico extends Empleado {
    private int años;
    
    public Electronico(){
        super();
        años = 0;
    }

    public Electronico(String nombre, int sueldo_basico, String direccion,int años) {
        super(nombre, sueldo_basico, direccion);
        this.años = años;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }
    
    @Override
    public String toString(){
        return "Datos Electronico{" + "Nombre: " + this.nombre + " // " + "Sueldo basico: " + this.sueldo_basico + 
                " // " + "Direccion: " + this.direccion + " // " + "Años de experiencia: " + this.años;
    }
    
    @Override
    public double electronico(){
        double sueldoF = 0;
        if(this.años < 3){
            sueldoF = this.sueldo_basico + (this.sueldo_basico * 0.05);
            System.out.println("Tu sueldo sera de S/." + sueldoF);
        }else if(this.años >= 3 && this.años  <= 5){
            sueldoF = this.sueldo_basico + (this.sueldo_basico * 0.005);
            System.out.println("Tu sueldo sera de S/." + sueldoF);
        }else if(this.años >= 5 && this.años <= 7){
            sueldoF = this.sueldo_basico + (this.sueldo_basico * 0.7);
            System.out.println("Tu sueldo sera de S/." + sueldoF);
        }else if(this.años >= 7){
            sueldoF = this.sueldo_basico + (this.sueldo_basico * 0.11);
            System.out.println("Tu sueldo sera de S/." + sueldoF);
        }
        return sueldoF;
    }
    
    @Override
    public double programador(){
        return 0;
    }
    
    @Override
    public double admin(){
        return 0;
    }
    
}
