package com.company.methodsnencapsulation;

public class CallByReferenceTest {
    public static void main(String[] args) {
        CallByReference ob = new CallByReference(15, 5);
        CallByReference ob2 = new CallByReference();


//        System.out.println("ob.a and ob.b before call: " +
//                ob.a + " " + ob.b);

        ob.meth(ob);

        System.out.println("ob.a and ob.b after call: " +
                ob.a + " " + ob.b);

                ob2.average();


        System.out.println(ob.sum());
//        ob.meth(ob2);

//        System.out.println("Object " + ob2.x + " " + ob2.y);

//        System.out.println(ob.meth(ob));
    }
}
