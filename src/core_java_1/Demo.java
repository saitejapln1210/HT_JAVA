package core_java_1;

public class Demo {
    public static void main(String[] args) {
        Main m = new Main(); // working via default constructor
        System.out.println(m.hashCode());



        Main mgf = new Main("Harshu");
        System.out.println(mgf.gf);
        Main gf1 = new Main("Mom");
        System.out.println(gf1.gf);


        System.out.println(Main.a); // 1
        Main temp1 = new Main(13);
        System.out.println(temp1.a); // 13 -- static variable changed because of temp1 object
        System.out.println(Main.a); // 13

        Main temp2 = new Main();
        System.out.println(temp2.a); // 13

        Main temp3 = new Main();
        temp3.insantanceMethod(30);
        System.out.println(Main.a);
        Main.staticMethod(69);
        System.out.println(Main.a);//69


        Main ch = new Main();
        ch.insantanceMethod(13);

    }
}