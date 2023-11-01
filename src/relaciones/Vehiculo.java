/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relaciones;

abstract public class Vehiculo {
    public String placa; // Atributo que define la placa de un vehículo
    
    /**
    * Constructor de la clase Vehículo
    * @param placa Parámetro que define la placa de un vehículo
    */
    Vehiculo(String placa) {
        this.placa = placa;
    }
}
