package com.company;

import org.omg.CORBA.Object;

import java.lang.management.OperatingSystemMXBean;

/**
 * Created by Jeison on 22 sep 2017.
 */

public class Fraccion extends Number implements Comparable , Operable  {

    double numerador;
    double denominador;


    /**
     * Constructor
     * @param numerador
     * @param denominador
     */
    public Fraccion(double numerador, double denominador) {
        double MCD =Euclides(numerador,denominador);
        this.numerador = numerador /MCD;
        this.denominador = denominador/MCD;
    }

    /**
     * Constructor
     */
    public Fraccion(){
        this.numerador=0;
        this.denominador=1;
    }

    /**
     * Constructor
     * @param entero entero
     */
    public Fraccion(double entero){
        this.numerador=entero;
        this.denominador=1;
    }


    /**
     * Obtiene el numerador
     * @return double: numerador
     */
    public double getNumerador() {
        return numerador;
    }

    /**
     * Obtiene el denominador
     * @return double: denominador
     */
    public double getDenominador() {
        return denominador;
    }


    /**
     * Metodo sobreescrito de la interface operable que
     * suma dos fracciones
     * @param Operable
     */
    @Override
    public void suma(Operable Operable) {
        Fraccion operable= (Fraccion) Operable;
        numerador=numerador*operable.getDenominador()+denominador* operable.getNumerador();
        denominador=denominador*operable.getDenominador();

        double MCD =Euclides(numerador,denominador);
        numerador= numerador /MCD;
        denominador = denominador/MCD;
    }

    /**
     * Metodo sobreescrito de la interface operable que
     * resta dos fracciones
     * @param Operable
     */
    @Override
    public void resta(Operable Operable) {
        Fraccion operable= (Fraccion) Operable;
        numerador=numerador*operable.getDenominador()-denominador* operable.getNumerador();
        denominador=denominador*operable.getDenominador();

        double MCD =Euclides(numerador,denominador);
        numerador= numerador /MCD;
        denominador = denominador/MCD;
    }

    /**
     * Metodo sobreescrito de la interface operable que
     * multiplicacion dos fracciones
     * @param Operable
     */
    @Override
    public void multiplicacion(Operable Operable) {
        Fraccion operable= (Fraccion) Operable;
        numerador=numerador*operable.getNumerador();
        denominador= denominador*operable.getDenominador();

        double MCD =Euclides(numerador,denominador);
        numerador= numerador /MCD;
        denominador = denominador/MCD;
    }

    /**
     * Metodo sobreescrito de la interface operable que
     * division dos fracciones
     * @param Operable
     */

    @Override
    public void division(Operable Operable){
        Fraccion operable= (Fraccion) Operable;
        numerador=numerador*operable.getDenominador();
        denominador= denominador*operable.getNumerador();

        double MCD =Euclides(numerador,denominador);
        numerador= numerador /MCD;
        denominador = denominador/MCD;
    }


    /**
     * Metodo sobreescrito para comparar dos fracciones
     * @param o
     * @return
     */
    @Override
    public int compareTo(java.lang.Object o) {
        Fraccion f = (Fraccion) o;
        if (numerador / denominador - f.getNumerador() / f.getDenominador() > 0) {
            return 1;
        } else {
            if (numerador / denominador - f.getNumerador() / f.getDenominador() == 0)
                return 0;
            else {
                return -1;
            }
        }
    }

    /**
     * Calcula el MCD por medio del algortmo de Euclides
     * @param a  extremo inferior de un intervalo euclideo
     * @param b  extremo superior de un intervalo euclideo
     */
    public   double Euclides(double a, double b){
        double r=a% b;
        while (r!=0){
            a=b;
            b=r;
            r=a% b;
        }
       return b;
    }

    /**
     * To string
     * @return
     */
    @Override
    public String toString() {
        return "("+ numerador +"/"+ denominador + ")";
    }





    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }


}