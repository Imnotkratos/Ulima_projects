/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2;

/**
 *
 * @author Usuario
 */
public class Admin extends Empleado {
    private String cargo;
    
    public Admin(){
        super();
        cargo = "";
    }

    public Admin(String nombre, int sueldo_basico, String direccion,String cargo) {
        super(nombre, sueldo_basico, direccion);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    @Override
    public String toString(){
        return "Admin{" + "Nombre: " + this.nombre + " // " + "Sueldo basico: " + this.sueldo_basico + " // " + 
                "Direccion: " + this.direccion + " // " + "Cargo en la empresa: " + this.cargo;
    }
    
    @Override
    public double admin(){
        double sueldoF = 0;
        if(this.cargo.equalsIgnoreCase("Secretaria")){
            sueldoF = this.sueldo_basico + 30;
            System.out.println("Tu sueldo sera de S/." + sueldoF);
        }else if(this.cargo.equalsIgnoreCase("Jefe de sección")){
            sueldoF = this.sueldo_basico + (this.sueldo_basico * 0.05) + 150;
            System.out.println("Tu sueldo sera de S/." + sueldoF);
        }else if(this.cargo.equalsIgnoreCase("Gerente")){
            sueldoF = this.sueldo_basico + (this.sueldo_basico * 0.10) + 300;
            System.out.println("Tu sueldo sera de S/." + sueldoF);
        }
        return sueldoF;
    }
    
    @Override
    public double programador(){
        return 0;
    }
    
    @Override
    public double electronico(){
        return 0;
    }
    
    
}
