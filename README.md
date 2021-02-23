# NOTES

# 22-02-2021
# Using final
Normally, Java calls methods dynamically at runtime -> late binding.
However since FINAL methods cannot be overridden, a call to on can be resolved at compile time -> early binding.

# Packages & Interfaces

* java runtime uses current working directory as its starting point
* You can set CLASSPATH environmental variable.
* you can use -classpath option with java and javac
* Interfaces are in different hierarchy from classes and this helps support dynamic method resolution since it is posible for classes that are unrelated in terms of hierarchy to implement the same interface. 
* Variables are final, static and public and must be initialized.
* Interface Methods are implicitly public.
* when you implement an interface method, it must be declared as public.
* a class that does not implement all the methods in an interface must be declared abstract.
# Default methods in Interfaces
* The implementing class does not have to override the default method.
* If the default method has not been overridden the default will be used.
* If a class implements two interfaces that have the same default method, the implementing class must override the method or else you will have a compile time error.
* If an interface inherits another with both defining a common default method the inheriting interface's version of the method take higher precedence. 
* If an interface inherits and the class overrides the method, the class will take precedence.
* You can use super keyword to refer to the default implementation. Only for default methods
