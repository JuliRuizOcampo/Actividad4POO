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
* Esta clase denominada InmuebleVivienda modela un inmueble
* destinado para la vivienda con atributos como el número de
* habitaciones y el número de baños que posee
* @version 1.2/2020
*/
public class InmuebleVivienda extends Inmueble {
    /* Atributo que identifica el número de habitacion de un inmueble
    para vivienda */
    protected int numeroHabitaciones;
    /* Atributo que identifica el número de banos de un inmueble para
    vivienda */
    protected int numeroBanos;
    
    /**
    * Constructor de la clase InmuebleVivienda
    * @param identificadorInmobiliario Parametro que define el
    * identificador inmobiliario de un inmueble para la vivienda
    * @param area Parametro que define el área de un inmueble para la
    * vivienda
    * @param direccion Parametro que define la dirección donde se
    * encuentra localizado un inmueble para la vivienda
    * @param numeroHabitaciones Parametro que define el número de
    * habitaciones que tiene un inmueble para la vivienda
    * @param numeroBanos Parametro que define el número de banos
    * que tiene un inmueble para la vivienda
    */
    public InmuebleVivienda(int identificadorInmobiliario, int area, String
    direccion, int numeroHabitaciones, int numeroBanos) {
        super(identificadorInmobiliario, area, direccion); /* Invoca al
        constructor de la clase padre */
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBanos = numeroBanos;
    }
    
    /**
    * Método que muestra en pantalla los datos de un inmueble para la
    * vivienda
    */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Número de habitaciones = " +
        numeroHabitaciones);
        System.out.println("Número de banos = " + numeroBanos);
    }
}
