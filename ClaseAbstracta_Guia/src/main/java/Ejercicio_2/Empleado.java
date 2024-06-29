/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2;

/**
 *
 * @author Usuario
 */
public abstract class Empleado {
    protected String nombre;
    protected int sueldo_basico;
    protected String direccion;

    public Empleado(){
        nombre = "";
        sueldo_basico = 0;
        direccion = "";
    }

    public Empleado(String nombre, int sueldo_basico, String direccion) {
        this.nombre = nombre;
        this.sueldo_basico = sueldo_basico;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo_basico() {
        return sueldo_basico;
    }

    public void setSueldo_basico(int sueldo_basico) {
        this.sueldo_basico = sueldo_basico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
       
    public abstract double programador();
    public abstract double electronico();
    public abstract double admin();


}
