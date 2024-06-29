/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_1;

/**
 *
 * @author Usuario
 */
public abstract class Persona {
    protected String nombre;
    protected int dni;
    protected String mPago;
    protected double monto_total;
    
    public Persona(){
        nombre = "";
        dni = 0;
        mPago = "";
        monto_total = 0;
    }

    public Persona(String nombre, int dni, String mPago, double monto_total) {
        this.nombre = nombre;
        this.dni = dni;
        this.mPago = mPago;
        this.monto_total = monto_total;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }


    public String getmPago() {
        return mPago;
    }

    public void setmPago(String mPago) {
        this.mPago = mPago;
    }

    public double getMonto_total() {
        return monto_total;
    }

    public void setMonto_total(double monto_total) {
        this.monto_total = monto_total;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + this.nombre + "\t" + "DNI: " + 
                this.dni;
    }
    
    
    public abstract double  Socio(int tiempo);
    public abstract double noSocio(int entradas);

}
