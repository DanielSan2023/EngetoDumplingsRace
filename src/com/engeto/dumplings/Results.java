package com.engeto.dumplings;

public class Results {



    public static void printShortName(String surname, String name) {
        // Celková délka:
        int maxNameLength = 20;
        int length = surname.length() + name.length();
        String result;
        if (length > maxNameLength) {
            result = surname + " " + name.charAt(0)+".";
        } else {
            result = surname + " " + name;
        }

        // Pokud je jméno stále příliš dlouhé, zkrať ho:
        if (result.length() > maxNameLength) {
            result = result.substring(0, maxNameLength-4)+"...";
        }
        System.out.println(result);
    }
}