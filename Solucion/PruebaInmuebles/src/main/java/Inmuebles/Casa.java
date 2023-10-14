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
* Esta clase denominada Casa modela un tipo específico de inmueble
* destinado para la vivienda con atributos como el número de pisos
* que tiene una casa.
* @version 1.2/2020
*/
public class Casa extends InmuebleVivienda {
    protected int numeroPisos; /* Atributo que identica el número de
    pisos que tiene una casa */
    
    /**
    * Constructor de la clase Casa
    * @param identificadorInmobiliario Parametro que define el
    * identificador inmobiliario de una casa
    * @param area Parametro que define el área de una casa
    * @param direccion Parametro que define la dirección donde se
    * encuentra localizada una casa
    * @param numeroHabitaciones Parametro que define el número de
    * habitaciones que tiene una casa
    * @param numeroBanos Parametro que define el número de banos
    * que tiene una casa
    * @param numeroPisos Parametro que define el número de pisos
    * que tiene una casa
    */
    public Casa(int identificadorInmobiliario, int area, String direccion,
    int numeroHabitaciones, int numeroBanos, int numeroPisos) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion,
        numeroHabitaciones, numeroBanos);
        this.numeroPisos = numeroPisos;
    }
    
    /**
    * Método que muestra en pantalla los datos de una casa
    */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Número de pisos = " + numeroPisos);
    }
}
