package com.company;

import org.omg.CORBA.Object;

/**
 * Created by Jeison on 22 sep 2017.
 */
public interface Operable {

    void suma(Operable operable);
    void resta(Operable operable);

    void multiplicacion(Operable operable);

    void division(Operable operable);


}
