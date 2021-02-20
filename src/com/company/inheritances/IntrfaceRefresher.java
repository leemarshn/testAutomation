package com.company.inheritances;

public abstract interface IntrfaceRefresher extends Predicate, Structure {
    //does not hav to hav any method
    //cannot be marked; private protected ot final - top level
    //an interface can extend more than one interface separated by commas.

    public final int k =0;
    int y = 13;
    //will not compile
    //variables are final, public & static and must be initialize at declaration
    int b=0;

     default  double getTemperature() {
        return 10.0;
    }



    //default methods are not assumed, static, abstract or final
    //can only be found in interfaces
    //assumed to be public and won't compile when marked private or protected
    /** if an interface extends another .. it may redeclare a default method as abstract
     * requiring the implementing class to override it
     *
     */
}
