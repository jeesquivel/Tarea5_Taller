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

    public Fraccion(){
        this.numerador=0;
        this.denominador=1;
    }


    public double getNumerador() {
        return numerador;
    }

    public double getDenominador() {
        return denominador;
    }

    @Override
    public void suma(Operable Operable) {
        Fraccion operable= (Fraccion) Operable;
        numerador=numerador*operable.getDenominador()+denominador* operable.getNumerador();
        denominador=denominador*operable.getDenominador();

        double MCD =Euclides(numerador,denominador);
        numerador= numerador /MCD;
        denominador = denominador/MCD;
    }

    @Override
    public void resta(Operable Operable) {
        Fraccion operable= (Fraccion) Operable;
        numerador=numerador*operable.getDenominador()-denominador* operable.getNumerador();
        denominador=denominador*operable.getDenominador();

        double MCD =Euclides(numerador,denominador);
        numerador= numerador /MCD;
        denominador = denominador/MCD;
    }

    @Override
    public void multiplicacion(Operable Operable) {
        Fraccion operable= (Fraccion) Operable;
        numerador=numerador*operable.getNumerador();
        denominador= denominador*operable.getDenominador();

        double MCD =Euclides(numerador,denominador);
        numerador= numerador /MCD;
        denominador = denominador/MCD;
    }

    @Override
    public void division(Operable Operable){
        Fraccion operable= (Fraccion) Operable;
        numerador=numerador*operable.getDenominador();
        denominador= denominador*operable.getNumerador();

        double MCD =Euclides(numerador,denominador);
        numerador= numerador /MCD;
        denominador = denominador/MCD;
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


    @Override
    public String toString() {
        return "("+ numerador +"/"+ denominador + ")";
    }
}