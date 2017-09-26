package com.company;


/**
 * Created by Jeison on 25 sep 2017.
 */
public class Monomio  extends  Expresion{


    Fraccion coeficiente;
    int potencia;


    /**
     * Constructor
     * @param coeficiente
     */
    public Monomio(Fraccion coeficiente, int potencia) {

        this.coeficiente = coeficiente;
        this.potencia=potencia;
    }

    /**
     * Constructor
     * @param coeficiente Objeto de tipo Fraccion
     */

    public Monomio(Fraccion coeficiente){
        this.coeficiente=coeficiente;
        this.potencia=0;
    }

    /**
     * Constructor
     */

    public Monomio(){
        this.coeficiente=new Fraccion();
        this.potencia=0;
    }

    /**
     * Obtener coeficiente del monomio
     * @return Fraccion
     */
    public Fraccion getCoeficiente() {
        return coeficiente;
    }

    public int getPotencia() {
        return potencia;
    }

    /**
     * metodo sobreescrito de la clase abstracta Expresion que suma dos monomios
     * @param operable
     */
    @Override
    public void suma(Operable operable) {
        Fraccion pCoeficiente=  ((Monomio) operable).getCoeficiente();
        coeficiente.suma(pCoeficiente);
    }

    /**
     * metodo sobreescrito de la clase abstracta Expresion que resta dos monomios
     * @param operable
     */

    @Override
    public void resta(Operable operable) {
        Fraccion pCoeficiente=  ((Monomio) operable).getCoeficiente();
        coeficiente.resta(pCoeficiente);
    }


    /**
     * metodo sobreescrito de la clase abstracta Expresion que multiplica dos monomios
     * @param operable
     */
    @Override
    public void multiplicacion(Operable operable) {
        Fraccion pCoeficiente=  ((Monomio) operable).getCoeficiente();
        coeficiente.multiplicacion(pCoeficiente);
        potencia+= ((Monomio) operable).getPotencia();
    }

    /**
     * metodo sobreescrito de la clase abstracta Expresion que divide dos monomios
     * @param operable
     */

    @Override
    public void division(Operable operable) {
        Fraccion pCoeficiente=  ((Monomio) operable).getCoeficiente();
        if ( pCoeficiente.getNumerador()==0 ){
            System.out.println("no divisiones por cero");
        }else{
            coeficiente.division(pCoeficiente);
            potencia=potencia- ((Monomio) operable).getPotencia();
        }

    }


    /**
     * to String del monomio
     * @return
     */
    @Override
    public String toString() {
        String variable="x";
        String coeficienteString=""+coeficiente.getNumerador()+"/"+coeficiente.getDenominador();
        String PotenciaString = ""+potencia;
        String elevado= "^";
        if ( potencia==0 ){
            variable="";
            PotenciaString="";
            elevado="";
        }

        if ( coeficiente.getDenominador()==1){
            coeficienteString=""+coeficiente.getNumerador();
            if ( coeficiente.getNumerador()==0 ){
                coeficienteString="";
                return "";
            }
        }
        return "("+coeficienteString+")"+variable+elevado+PotenciaString;
    }
}
