package com.company;


public class Main {

    public static void main(String[] args) {

        /*
        crea los coeficioentes de los monomios
         */
        Fraccion f= new Fraccion(1,5);
        Fraccion g= new Fraccion(3,4);
        Fraccion h = new Fraccion(3);
        Fraccion i= new Fraccion(0);

        Monomio m= new Monomio(f,2);
        Monomio m1= new Monomio(g,3);
        Monomio m2= new Monomio(h,3);


        Monomio m3= new Monomio(i);


        /*
        Ejemplo: division de monomios
         */
        m1.division(m3); /* divison por cero */
        System.out.println(m1.toString());

        m1.division(m2);       /*divsion de polinomios */
        System.out.println(m1.toString());

        m.division(m2);       /*divsion de polinomios */
        System.out.println(m.toString());

        /*
        Instancia de polinomios
         */
        Polinomio polinomio1= new Polinomio();
        Polinomio polinomio2= new Polinomio();

        /*
        Suma de monomios al polinomio
         */
        polinomio1.suma(m);
        polinomio1.suma(m1);

        System.out.println(polinomio1.toString()); /*Imprime el polinomio */

        polinomio2.suma(m2);

        System.out.println(polinomio2.toString());


        /*
        Suma de polinomios
         */
        polinomio1.sumaPolinomios(polinomio2);

        System.out.println(polinomio1.toString());

        /*
        Copia de un polinomio
         */
        Polinomio Copy1= (Polinomio) polinomio2.clone();

        polinomio1.sumaPolinomios(Copy1);

        System.out.println(polinomio1.toString());



    }
}
