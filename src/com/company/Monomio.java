package com.company;

import java.lang.management.MonitorInfo;

/**
 * Created by Jeison on 25 sep 2017.
 */
public class Monomio  extends  Expresion{

    Fraccion coeficiente;

    /**
     * Constructor
     * @param coeficiente
     */
    public Monomio(Fraccion coeficiente) {
        this.coeficiente = coeficiente;
    }

    public Monomio(){
        this.coeficiente=new Fraccion();
    }

    /**
     * Obtener coeficiente del monomio
     * @return Fraccion
     */
    public Fraccion getCoeficiente() {
        return coeficiente;
    }


    @Override
    public void suma(Operable operable) {
        Fraccion pCoeficiente=  ((Monomio) operable).getCoeficiente();
        coeficiente.suma(pCoeficiente);
    }

    @Override
    public void resta(Operable operable) {
        Fraccion pCoeficiente=  ((Monomio) operable).getCoeficiente();
        coeficiente.resta(pCoeficiente);
    }

    @Override
    public void multiplicacion(Operable operable) {
        Fraccion pCoeficiente=  ((Monomio) operable).getCoeficiente();
        coeficiente.multiplicacion(pCoeficiente);
    }

    @Override
    public void division(Operable operable) {
        Fraccion pCoeficiente=  ((Monomio) operable).getCoeficiente();
        coeficiente.division(pCoeficiente);
    }


    @Override
    public String toString() {
        return coeficiente.toString()+"x";
    }
}
