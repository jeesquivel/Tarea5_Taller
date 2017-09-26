package com.company;




/**
 * Created by Jeison on 22 sep 2017.
 */
public abstract class Expresion extends java.lang.Object implements Operable, Cloneable {

    /**
     * Metodo abstracto para sumar
     * @param operable
     */
    @Override
    public void suma(Operable operable) {

    }

    /**
     * Metodo abstracto para restar
     * @param operable
     */
    @Override
    public void resta(Operable operable) {

    }

    /**
     * Metodo abstracto para multiplicacion
     * @param operable
     */
    @Override
    public void multiplicacion(Operable operable) {
    }

    /**
     * Metodo abstracto para dividir
     * @param operable
     */

    @Override
    public void division(Operable operable) {
    }



    @Override
    public Object clone() {
        Object obj = null;
        try {
            obj = (Object) super.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println("No se puede duplicar el objeto :(");
        }
        return obj;
    }

}
