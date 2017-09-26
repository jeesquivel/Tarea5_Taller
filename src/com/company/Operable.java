package com.company;

import org.omg.CORBA.Object;

/**
 * Created by Jeison on 22 sep 2017.
 */
public interface Operable {


    /**
     * Metodo suma de la interface
     * @param operable
     */
    void suma(Operable operable);
    /**
     * Metodo resta de la interface
     * @param operable
     */
    void resta(Operable operable);

    /**
     * Metodo multiplicacion de la interface
     * @param operable
     */
    void multiplicacion(Operable operable);
    /**
     * Metodo division de la interface
     * @param operable
     */
    void division(Operable operable);


}
