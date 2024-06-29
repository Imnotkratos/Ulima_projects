/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2;

/**
 *
 * @author Usuario
 */
public class Programador extends Empleado{
    private String especialidad;
    private int grado;
    
    public Programador(){
        super();
        especialidad = "";
        grado = 0;
    }

    public Programador(String nombre, int sueldo_basico, String direccion, String especialidad,int grado) {
        super(nombre, sueldo_basico, direccion);
        this.especialidad = especialidad;
        this.grado = grado;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }
    
    @Override
    public String toString(){
        return "Programador: {" + "Nombre: " + this.nombre + " // " + "Sueldo base: " + this.sueldo_basico + " //"  + "Direccion: " + this.direccion + " // "+
                "Especialidad: " + this.especialidad + " // " + "Grado de profesion: " + this.grado;
    }
    
    @Override
    public double programador(){
        double sueldoF = 0;
        if(this.grado == 0){
            sueldoF = this.sueldo_basico + 50;
            System.out.println("Tu sueldo final sera de S/." + sueldoF);
        }else if(this.grado == 1){
            sueldoF = this.sueldo_basico + 100;
            System.out.println("Tu sueldo final sera de S/:" + sueldoF);
        }else if(this.grado == 2){
            sueldoF = this.sueldo_basico + 250;
            System.out.println("Tu sueldo final sera de S/." + sueldoF);
        }else if(this.grado == 3){
            sueldoF = this.sueldo_basico + 500;
            System.out.println("Tu sueldo final sera de S/:" + sueldoF);
        }
        return sueldoF;
    }
    
    @Override
    public double electronico(){
        return 0;
    }
    
    @Override
    public double admin(){
        return 0;
    }
    
    
}
