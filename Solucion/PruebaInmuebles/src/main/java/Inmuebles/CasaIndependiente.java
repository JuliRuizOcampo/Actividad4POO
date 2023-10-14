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
* Esta clase denominada CasaIndependiente modela un tipo específico
* de casa urbana que no está en conjunto cerrado y es completamente
* independiente de otras casas. Tiene un atributo estático para
* especificar un valor del área del inmueble.
* @version 1.2/2020
*/
public class CasaIndependiente extends CasaUrbana {
    // Atributo que identifica el valor por área de una casa independiente
    protected static double valorArea = 3000000;
    
    /**
    * Constructor de la clase CasaIndependiente
    * @param identificadorInmobiliario Parametro que define el
    * identificador inmobiliario de una casa independiente
    * @param area Parametro que define el área de una casa independiente
    * @param direccion Parametro que define la dirección donde se
    * encuentra localizada una casa independiente
    * @param numeroHabitaciones Parametro que define el número de
    * habitaciones que tiene una casa independiente
    * @param numeroBanos Parametro que define el número de banos
    * que tiene una casa independiente
    * @param numeroPisos Parametro que define el número de pisos
    * que tiene una casa independiente
    */
    public CasaIndependiente(int identificadorInmobiliario, int area,
    String direccion, int numeroHabitaciones, int numeroBanos, int
    numeroPisos) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos, numeroPisos);
    }
    
    /**
    * Método que muestra en pantalla los datos de una casa independiente
    */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println();
    }
}
