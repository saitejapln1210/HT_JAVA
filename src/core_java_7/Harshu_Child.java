package core_java_7;

public class Harshu_Child extends Harshu_Parent {
    public String name;
    int a = 2;

    Harshu_Child(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public  void m1() {
        System.out.println("In child class");
    }

    public void m2(){
        System.out.println("visibility protected");
    }

    public static void m1_static() {
        System.out.println("In static method child class");
    }

    public String revisionPlan(String... topic) {
        return "child var-arg method";
    }

    public String revisionPlan_specific(String... topic) {
        return "child var-arg method";
    }
}
