package org.example.WhileLoop;

public class StaticAndNonStatic {
    static String name = "Anar";
    String surname = "Ragimov";

    static void show() {
        System.out.println("Ad " + name + " Static class seviyesinde:");//static
    }

    void sleep() {
        System.out.println("Soyad " + surname + " -Static name elave oluna biler:" + name); // non static method cagirilanda static filds cagirmaq mumkundur:
    }


}

class MainA {
    public static void main(String[] args) {
        StaticAndNonStatic.show();
        StaticAndNonStatic s1 = new StaticAndNonStatic();
        s1.sleep();
        s1.surname.length();
    }

}
