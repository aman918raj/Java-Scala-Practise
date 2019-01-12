/*
Constructor Overloading

Like methods, we can overload constructors for creating objects in different ways.
Compiler differentiates constructors on the basis of numbers of parameters, types of the parameters and order of the parameters.
 */

public class JavaConstructorOverloading {

    JavaConstructorOverloading(String name){
        System.out.println("Constructor with one " +
                "argument - String : " + name);
    }

    JavaConstructorOverloading(String name, int id){
        System.out.println("Constructor with two arguments : " +
                " String and Integer : " + name + " "+ id);

    }

}
/*
Constructor(s) must have the same name as the class within which it defined while it is not necessary for the method in java.
Constructor(s) do not any return type while method(s) have the return type or void if does not return any value.
Constructor is called only once at the time of Object creation while method(s) can be called any numbers of time.
 */
