package com.company;


public class Main {

    public static void main(String[] args) {

        Fraccion f= new Fraccion(1,5);
        Fraccion g= new Fraccion(3,4);
        /*System.out.println(f.compareTo(g));*/

        Polinomio p= new Polinomio();

        Monomio m= new Monomio(f);
        Monomio m2= new Monomio(g);

        Polinomio CopyP= (Polinomio) p.clone();

        p.suma(m);
        p.suma(m2);

        System.out.println(p.toString());


    }
}
