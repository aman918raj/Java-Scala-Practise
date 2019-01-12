/*
Constructors are used to initialize the object’s state. Like methods, a constructor also contains collection of statements(i.e. instructions) that are executed at time of Object creation.

When is a Constructor called ?
Each time an object is created using new() keyword at least one constructor (it could be default constructor) is invoked to
assign initial values to the data members of the same class.

Constructor is invoked at the time of object or instance creation.

Rules for writing Constructor:
Constructor(s) of a class must has same name as the class name in which it resides.
A constructor in Java can not be abstract, final, static and Synchronized.
Access modifiers can be used in constructor declaration to control its access i.e which other class can call the
constructor.

In general, constructors are used for initializing variables as per the user requirement while creation of an
Object and allocates memory to that variable while creation of Objects.
The same constructor will be called each time we create a new object or instance of a class.

Advantages of Constructors:
A constructor eliminates placing the default values.
A constructor eliminates calling the normal method implicitly.

There are two type of constructor in Java:

No-argument constructor: A constructor that has no parameter is known as default constructor.
If we don’t define a constructor in a class, then compiler creates default constructor(with no arguments) for the class. And if we write a constructor with arguments or no-argument then compiler does not create default constructor.
Default constructor provides the default values to the object like 0, null etc. depending on the type.

Parameterized Constructor: A constructor that has parameters is known as parameterized constructor.
If we want to initialize fields of the class with your own values, then use parameterized constructor.

 */

public class JavaConstructor{

    public static class NoArgument{

        NoArgument(){
            System.out.println("No Argument Constructor");
        }
    }
    public static class WithArgument{
        String name;
        int id;
        WithArgument(String name, int id){
            this.name = name;
            this.id = id;
        }
    }

    public static void main (String[] args){
        // this would invoke default constructor.
        NoArgument nA = new NoArgument();
        WithArgument wA = new WithArgument("Aman",1111);
        System.out.println(wA.id +"," +wA.name);
    }
}
