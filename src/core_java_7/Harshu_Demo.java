package core_java_7;

public class Harshu_Demo {
    public static void main(String[] args) {
        Harshu_Parent harshuParent = new Harshu_Child("teja");
        System.out.println(harshuParent.a); // a = 1 - variable hiding  - compiler by reference
        harshuParent.m1_static(); // in parent - method hiding - compiler by reference
        harshuParent.m1(); // in child class - run time polymorphism - at run time so considers object
        System.out.println(harshuParent.revisionPlan("some")); // parent-var arg because its overloading not overriding
        System.out.println(harshuParent.revisionPlan_specific("some")); // as method signature is same with var_arg as parameter in both parent and child. it is overriding
    }
}
