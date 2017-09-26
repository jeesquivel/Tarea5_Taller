package com.company;

import java.util.ArrayList;

/**
 * Created by Jeison on 25 sep 2017.
 */
public class Polinomio extends  Expresion {
    ArrayList<Monomio> sumaMonomios;

    public Polinomio(Monomio monomio) {
        this.sumaMonomios =new ArrayList<>();
        this.sumaMonomios.add(monomio);
    }


    /**
     * Constructor
     */
    public Polinomio() {
        this.sumaMonomios =new ArrayList<>();
    }

    /**
     * Suma dos polinomios
     * @param polinomio
     */

    public void sumaPolinomios(Polinomio polinomio){
        try {

            for (Monomio m:polinomio.sumaMonomios){
                suma(m);
            }

        }catch (Exception e){
            System.out.println("no se puede sumar");
        }
    }


    /**
     * Metodo sobreescrito de la clase abstracta expresion
     * que suma monomios
     * @param operable un objeto dperable
     */

    @Override
    public void suma(Operable operable){
        try {
            Monomio monomio=(Monomio) operable;
            Monomio semejante= MonomioSemejante(monomio);
            if (semejante!=null){
                semejante.suma(monomio);
            }else{
                sumaMonomios.add(monomio);
            }

        }catch (Exception e){
            System.out.println("no se puede sumar");
        }
    }


    /**
     * To String
     * @return el polinomio  de manera de string
     */
    @Override
    public String toString() {
        String string="";
        String imprimir ="";

        for (Monomio i: sumaMonomios){
            string=i.toString();
            if ( string!=""){
                imprimir+=string +"+";
            }
        }
        return  imprimir+ "\n";
    }


    /**
     * determina si en el polinomio existen monomios semejanes con respecto al parametro
     * @param monomio monomio
     * @return monomio o null
     */
    public Monomio MonomioSemejante(Monomio monomio){
        for (Monomio m: sumaMonomios){
            if(m.getPotencia()==monomio.getPotencia()){
               return m;
            }
        }
        return null;
    }



}
