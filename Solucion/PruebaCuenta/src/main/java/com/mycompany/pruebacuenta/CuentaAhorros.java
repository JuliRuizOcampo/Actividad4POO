/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebacuenta;

/**
 *
 * @author julir
 */

/**
* Esta clase denominada CuentaAhorros modela una cuenta de ahorros
* que es una subclase de Cuenta. Tiene un nuevo atributo: activa.
* @version 1.2/2020
*/
public class CuentaAhorros extends Cuenta {
    /* Atributo que identifica si una cuenta esta activa; lo esta si su saldo
    es superior a 10000 */
    private boolean activa;
    
    /**
    * Constructor de la clase CuentaAhorros
    * @param saldo Parametro que define el saldo de la cuenta de ahorros
    * @param tasa Parametro que define la tasa anual de interes de la
    * cuenta de ahorros
    */
    public CuentaAhorros(float saldo, float tasa) {
        super(saldo, tasa);
        if (saldo < 10000) /* Si el saldo es menor a 10000, la cuenta no
        se activa */
            activa = false;
        else
            activa = true;
    }
    
    /**
    * Metodo que recibe una cantidad de dinero a retirar y actualiza el
    * saldo de la cuenta
    * @param saldo Parametro que define la cantidad a retirar de una
    * cuenta de ahorros
    */
    public void retirar(float cantidad) {
        if (activa) // Si la cuenta esta activa, se puede retirar dinero
            super.retirar(cantidad); /* Invoca al metodo retirar de la clase
            padre */
    }
    
    /**
    * Metodo que recibe una cantidad de dinero a consignar y actualiza
    * el saldo de la cuenta
    * @param saldo Parametro que define la cantidad a consignar en
    * una cuenta de ahorros
    */
    public void consignar(float cantidad) {
        if (activa) // Si la cuenta esta activa, se puede consignar dinero
            super.consignar(cantidad); /* Invoca al metodo consignar de
            la clase padre */
    }
    
    /**
    * Metodo que genera el extracto mensual de una cuenta de ahorros
    */
    public void extractoMensual() {
        /* Si la cantidad de retiros es superior a cuatro, se genera una
        comision mensual */
        if (numeroRetiros > 4) {
            comisionMensual += (numeroRetiros - 4) * 1000;
        }
        super.extractoMensual(); // Invoca al metodo de la clase padre
        /* Si el saldo actualizado de la cuenta es menor a 10000, la
        cuenta no se activa */
        if (saldo < 10000)
            activa = false;
    }
    
    /**
    * Metodo que muestra en pantalla los datos de una cuenta de
    ahorros
    */
    public void imprimir() {
        System.out.println("Saldo = $ " + saldo);
        System.out.println("Comision mensual = $ " + comisionMensual);
        System.out.println("Numero de transacciones = " +
            (numeroConsignaciones + numeroRetiros));
        System.out.println();
    }
}
