package core_java_1;


// why protected is not used at top level class
public class Main {

    public String gf; // insatnce variable

//    public static final String HARSHU = "I LOVE YOU"; // static constant variable
    public static int a = 1; // as it is static this is at class level, but can this changed by any constructor via local variable ?

    public Main(){
    }

    public Main(int a){
        this.a = a;
    }

    public Main(String gf){
        this.gf = gf;
    }

    public void insantanceMethod(int a){
        this.a = a;
    }

    public static void staticMethod(int a){
        a = 25;
    }


    // instance method -- both static and instance variables
    // static method -- only static variables
}

