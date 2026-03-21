package core_java_2;

public class Demo {
    public static void main(String[] args) {
//        MethodOverloading methodOverloading = new MethodOverloading();
//        System.out.println(methodOverloading.m1(1, 2));
//        System.out.println(methodOverloading.m1(1, 2, 3)); // compiler will decide the method resolution
        // compile time polymorphsim or static polymorphsim or early binding
        // compiler will decide the method resolution  how ? based on the reference i.e. MethodOverloading
        // method overloading is with compiler and compiler will do method resolution based on the reference but not runtime object creation



        // rule - 1
        // operator promotion --- byte - short/char - int - long - float - double

//        MethodOverloading methodOverloading1 = new MethodOverloading();
//        methodOverloading1.printValueInteger(1);
//        methodOverloading1.printValueLong(1);
        // even though it is not a exact match in the method signature. based on the datatype of the parameter it has, java has
        // capability to do operator promotion based on this flow  byte - short/char - int - long - float - double
        // Automatic datatype promotion in method overloading


       // rule - 2
       // rule 2 - prerequisite - EVERY CLASS IS ALSO A OBJECT -- REMEMBER THIS, based on this interviewer can ask some questions



        MethodOverloading methodOverloadingrule2 = new MethodOverloading();
        String s = "sample string";
        //methodOverloadingrule2.rule2Method(s); // finds all the exact match paramed method

        // prerequiste --- methods can accept null as value
//        methodOverloadingrule2.rule2Method(null);

        // string is a child and object is parent, THEY HAVE A RELATION i.e. parent and child relation. When the compiler cannot find the exact match
        // and when the value i.e. null in this scenario is being match with both the overloading methods, then it will consider the child class. CHILD CLASS IS THE PRIORITY

//        methodOverloadingrule2.rule2MethodString(null);



    }
}
