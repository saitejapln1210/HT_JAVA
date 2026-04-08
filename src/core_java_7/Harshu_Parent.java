package core_java_7;

public class Harshu_Parent {
    public String name;
    int a = 1;

    Harshu_Parent(String name) {
        this.name = name;
    }

    public  void m1() {
        System.out.println("In parent class");
    }


    protected void m2(){
        System.out.println("visibility protected");
    }


    public static void m1_static() {
        System.out.println("In static method parent class");
    }

    public String revisionPlan(String topic) {
        return "parent  var-arg method";
    }

    public String revisionPlan_specific(String... topic) {
        return "parent var-arg method";
    }

}
