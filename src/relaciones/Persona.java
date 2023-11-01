/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relaciones;

import java.sql.Date;
import java.util.*;

public class Persona{
    String nombre;
    String apellidos;
    String documento;
    String fechaNacimiento;
    
    public ArrayList vehiculos;
    public int totalPeajes;
   
    
    
    public Persona(String nombre, String apellidos, String documento, String fechaActual){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.documento = documento;
        this.fechaNacimiento = fechaActual;

        this.vehiculos = new ArrayList<>();
        this.totalPeajes = 0;
        
    }

    public Persona() {
    }

    public void asignarVehiculo (Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }

    public void desasignarVehiculo (Vehiculo vehiculo){
        vehiculos.remove(vehiculo);
    }

    

    public void calcularTotalPeajes(){
        int calcularTotalPeajes = 0;
        for (Object vehiculo : vehiculos){
            if(vehiculo instanceof Carro){
                calcularTotalPeajes += Carro.valorPeaje;
            }else{
                if(vehiculo instanceof Moto){
                    calcularTotalPeajes += Moto.valorPeaje;
                }else if(vehiculo instanceof Camion camion){
                    calcularTotalPeajes += camion.numeroEjes * camion.valorPeajeEje;
                }
           } 
        }
        this.totalPeajes = calcularTotalPeajes;
    } 
 }