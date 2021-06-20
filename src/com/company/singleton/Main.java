package com.company.singleton;

public class Main {

    public static void main(String[] args) {

        Clipboard c1 = Clipboard.getInstance();
        Clipboard c2 = Clipboard.getInstance();

        c1.copy("abc");
        c1.paste();

        c1.paste();

        c2.copy("xyz");
        c1.paste();
        c2.paste();
        c1.copy("pqr");
        c2.paste();

    }
}
