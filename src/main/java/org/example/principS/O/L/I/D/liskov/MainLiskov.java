package org.example.principS.O.L.I.D.liskov;

public class MainLiskov {

    public static void main(String[] args) {

        Canli qadin = new Women();
        Canli kisi = new Men();


        qadin.eating();
        kisi.eating();
    }

}
