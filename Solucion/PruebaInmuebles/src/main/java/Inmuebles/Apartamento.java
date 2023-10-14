/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmuebles;

/**
 *
 * @author julir
 */
/**
* Esta clase denominada Apartamento modela un tipo de inmueble
* específico destinado para la vivienda.
* @version 1.2/2020
*/
public class Apartamento extends InmuebleVivienda {
    /**
    * Constructor de la clase Apartamento
    * @param identificadorInmobiliario Parametro que define el
    * identificador inmobiliario de un apartamento
    * @param area Parametro que define el área de un apartamento
    * @param direccion Parametro que define la dirección donde se
    * encuentra localizado un apartamento
    * @param numeroHabitaciones Parametro que define el número de
    * habitaciones que tiene un apartamento
    * @param numeroBanos Parametro que define el número de banos
    * que tiene un apartamento
    */
    public Apartamento(int identificadorInmobiliario, int area, String
    direccion, int numeroHabitaciones, int numeroBanos) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion,
        numeroHabitaciones, numeroBanos);
    }
    
    /**
    * Método que muestra en pantalla los datos de un apartamento
    */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
    }
}
