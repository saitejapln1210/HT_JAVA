package core_java_2;

public class MethodOverloading {



     public int m1(int n1, int n2){
         return n1 + n2;
     }

     public int m1(int n1, int n2, int n3){
         return n1 + n2 + n3;
     }

    //byte - short/char - int - long - float - double
//     public void printValueInteger(int a){
//         System.out.println(a);
//     }


    public void printValueLong(long a){
        System.out.println(a);
    }
    // method signature only consists of method name and its parameters NOT RETURN TYPE
    // method signatutre == name + params
    // method overloading means same method name but different params



    public void rule2Method(Object o){
        System.out.println("object type");
    }

    public void rule2Method(String s){
        System.out.println("string type");
    }


    public void rule2MethodString(String s1){
        System.out.println("string type");
    }

    public void rule2MethodString(StringBuffer sb){
        System.out.println("string Buffer type");
    }

}
