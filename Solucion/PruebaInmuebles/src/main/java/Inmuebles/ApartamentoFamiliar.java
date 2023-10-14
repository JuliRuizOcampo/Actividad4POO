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
* Esta clase denominada ApartamentoFamiliar modela un tipo
* específico de apartamento con atributos como el valor por área y el
* valor de la administración.
* @version 1.2/2020
*/
public class ApartamentoFamiliar extends Apartamento {
    // Atributo que identifica el valor por área de un apartamento familiar
    protected static double valorArea = 2000000;
    /* Atributo que identifica el valor de la administración de un
    apartamento familiar */
    protected int valorAdministracion;
    
    /**
    * Constructor de la clase ApartamentoFamiliar
    * @param identificadorInmobiliario Parametro que define el
    * identificador inmobiliario de un apartamento familiar
    * @param area Parametro que define el área de un apartamento familiar
    * @param direccion Parametro que define la dirección donde se
    * encuentra localizado un apartamento familiar
    * @param numeroHabitaciones Parametro que define el número de
    * habitaciones que tiene un apartamento familiar
    * @param numeroBanos Parametro que define el número de banos
    * que tiene un apartamento familiar
    * @param valorAdministracion Parametro que define el valor de la
    * administración de un apartamento familiar
    */
    public ApartamentoFamiliar(int identificadorInmobiliario, int area,
    String direccion, int numeroHabitaciones, int numeroBanos, int
    valorAdministracion) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion,
        numeroHabitaciones, numeroBanos);
        this.valorAdministracion = valorAdministracion;
    }
    
    /**
    * Método que muestra en pantalla los datos de un apartamento familiar
    */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Valor de la administración = $" +
        valorAdministracion);
        System.out.println();
    }
}
