package com.chudnikau.inherited.override;

public class Main {
    public static void main(String[] args) {
        Bart b = new Bart();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhouse());
        b.voice();
    }
}
