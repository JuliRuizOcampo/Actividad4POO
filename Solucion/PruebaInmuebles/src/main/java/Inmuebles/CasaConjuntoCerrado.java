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
* Esta clase denominada CasaConjuntoCerrado modela un tipo
* específico de casa urbana que se encuentra en un conjunto cerrado
* con atributos como el valor por área, valor de la administración y
* valores booleanos para especificar si tiene piscina y campos deportivos.
* @version 1.2/2020
*/
public class CasaConjuntoCerrado extends CasaUrbana {
    // Atributo que define el valor por área de una casa en conjunto cerrado
    protected static double valorArea = 2500000;
    
    /* Atributo que define el valor de administración de una casa en
    conjunto cerrado */
    protected int valorAdministracion;
    // Atributo que define si una casa en conjunto cerrado tiene piscina
    protected boolean tienePiscina;
    
    /* Atributo que define si una casa en conjunto cerrado tiene campos
    deportivos */
    protected boolean tieneCamposDeportivos;
    
    /**
    * Constructor de la clase CasaConjuntoCerrado
    * @param identificadorInmobiliario Parametro que define el
    * identificador inmobiliario de una casa en conjunto cerrado
    * @param area Parametro que define el área de una casa en conjunto
    * cerrado
    * @param direccion Parametro que define la dirección donde se
    * encuentra localizada una casa en conjunto cerrado
    * @param numeroHabitaciones Parametro que define el número de
    * habitaciones que tiene una casa en conjunto cerrado
    * @param numeroBanos Parametro que define el número de banos
    * que tiene una casa en conjunto cerrado
    * @param numeroPisos Parametro que define el número de pisos
    * que tiene una casa en conjunto cerrado
    * @param valorAdministracion Parametro que define el valor de
    * administración para una casa en conjunto cerrado
    * @param tienePiscina Parametro que define si una casa en conjunto
    * cerrado tiene o no piscina
    * @param tieneCamposDeportivos Parametro que define si una casa
    * en conjunto cerrado tiene o no campos deportivos
    */
    public CasaConjuntoCerrado(int identificadorInmobiliario, int area,
    String direccion, int numeroHabitaciones, int numeroBanos,
    int numeroPisos, int valorAdministracion, boolean tienePiscina,
    boolean tieneCamposDeportivos) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos, numeroPisos);
        this.valorAdministracion = valorAdministracion;
        this.tienePiscina = tienePiscina;
        this.tieneCamposDeportivos = tieneCamposDeportivos;
    }
    
    /**
    * Método que muestra en pantalla los datos de una casa en conjunto
    * cerrado
    */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Valor de la administración = $" +
        valorAdministracion);
        System.out.println("Tiene piscina? = " + tienePiscina);
        System.out.println("Tiene campos deportivos? = " +
        tieneCamposDeportivos);
        System.out.println();
    }
}
