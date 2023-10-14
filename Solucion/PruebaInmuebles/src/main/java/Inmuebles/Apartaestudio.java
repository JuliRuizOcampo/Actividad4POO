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
* Esta clase denominada Apartaestudio modela un tipo específico de
* apartamento que tiene una sola habitación.
* @version 1.2/2020
*/
public class Apartaestudio extends Apartamento {
    // Atributo que identifica el valor por área de un apartaestudio
    protected static double valorArea = 1500000;
    
    /**
    * Constructor de la clase Apartaestudio
    * @param identificadorInmobiliario Parametro que define el
    * identificador inmobiliario de un apartaestudio
    * @param area Parametro que define el área de un apartaestudio
    * @param direccion Parametro que define la dirección donde se
    * encuentra localizado un apartaestudio
    * @param numeroHabitaciones Parametro que define el número de
    * habitaciones que tiene un apartaestudio
    * @param numeroBanos Parametro que define el número de banos
    * que tiene un apartaestudio
    */
    public Apartaestudio(int identificadorInmobiliario, int area, String
    direccion,
    int numeroHabitaciones, int numeroBanos) {
        // Invoca al constructor de la clase padre
        // Los apartaestudios tienen una sola habitación y un solo baño
        super(identificadorInmobiliario, area, direccion, 1, 1);
    }
    
    /**
    * Método que muestra en pantalla los datos de un apartaestudio
    */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println();
    }
}
