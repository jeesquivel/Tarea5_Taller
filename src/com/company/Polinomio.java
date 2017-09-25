package com.company;

import java.util.ArrayList;

/**
 * Created by Jeison on 25 sep 2017.
 */
public class Polinomio extends  Expresion {
    Monomio monomio;
    ArrayList<Monomio> sumaMonomoios;

    public Polinomio(Monomio monomio) {
        this.monomio = monomio;
        this.sumaMonomoios=new ArrayList<>();
        this.sumaMonomoios.add(monomio);
        this.sumaMonomoios=new ArrayList<>();
    }

    public Polinomio() {
        this.monomio=new Monomio();
        this.sumaMonomoios=new ArrayList<>();
    }

    @Override
    public void suma(Operable operable){
        try {
            monomio.suma(operable);
            sumaMonomoios.add((Monomio) operable);
        }catch (Exception e){
            System.out.println("no se puede sumar");
        }
    }

    @Override
    public String toString() {
        String string="";
        for (Monomio i: sumaMonomoios){
            string+=i.toString()+" +";
        }
        return  string+ "\n" +"Monomio:"+monomio.toString();
    }
}
