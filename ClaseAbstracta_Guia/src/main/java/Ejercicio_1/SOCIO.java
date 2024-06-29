/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_1;

public class SOCIO extends Persona{
    private int code;
    
    public SOCIO(){
        super();
        code = 0;
    }

    public SOCIO( String nombre, int dni, String mPago, double monto_total,int code) {
        super(nombre, dni, mPago, monto_total);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString(){
        return "Socio{" +"Nombre: "+ this.nombre + "//"+ "DNI: " + this.dni + "//"+ "Codigo: " + this.code + "}";
    }
    
    @Override
    public double Socio(int tiempo){
        double montoF = 0;
        if(tiempo < 5){
            montoF = this.monto_total * 0.4;
            System.out.println("El monto a pagar será: " + montoF);
        }else if(tiempo > 5 && tiempo < 10){
            montoF = this.monto_total * 0.3;
            System.out.println("El monto a pagar será " + montoF);
        }else if(tiempo > 10){
            montoF = this.monto_total * 0.2;
            System.out.println("EL monto a pagar será " + montoF);
        }
        return montoF;
    }
    
    public double noSocio(int entrada){
        return 0;
    }
    
    
}
