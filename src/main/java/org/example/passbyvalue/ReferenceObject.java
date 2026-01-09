package org.example.passbyvalue;

public class ReferenceObject {

    public static void main(String[] args) {
        ReferenceObject obj = null;

        try {
            obj.toString();
        } catch (NullPointerException e) {
            System.out.checkError();
            System.err.println("Xeta bas verdi: "+e.getMessage());
            System.out.println(e.toString());
        } finally {
            System.out.println();
        }
    }

}
