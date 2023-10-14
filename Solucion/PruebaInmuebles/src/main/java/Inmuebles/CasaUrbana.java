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
* Esta clase denominada CasaUrbana modela un tipo específico de casa
* destinada para la vivienda localizada en el sector urbano.
* @version 1.2/2020
*/
public class CasaUrbana extends Casa {
    /**
    * Constructor de la clase CasaUrbana
    * @param identificadorInmobiliario Parametro que define el
    * identificador inmobiliario de una casa urbana
    * @param area Parametro que define el área de una casa urbana
    * @param direccion Parametro que define la dirección donde se
    * encuentra localizada una casa urbana
    * @param numeroHabitaciones Parametro que define el número de
    * habitaciones que tiene una casa urbana
    * @param numeroBanos Parametro que define el número de banos
    * que tiene una casa urbana
    * @param numeroPisos Parametro que define el número de pisos
    * que tiene una casa urbana
    */
    public CasaUrbana(int identificadorInmobiliario, int area, String
    direccion, int numeroHabitaciones, int numeroBanos, int
    numeroPisos) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion,
        numeroHabitaciones, numeroBanos, numeroPisos);
    }
    
    /**
    * Método que muestra en pantalla los datos de una casa urbana
    */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
    }
}
