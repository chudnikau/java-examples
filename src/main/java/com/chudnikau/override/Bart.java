package com.chudnikau.override;

public class Bart extends Homer {

    void doh(Milhouse m) {
        System.out.println("doh(Milhouse)");
    }

//    @Override
    void voice() {
        super.voice();
        System.out.println("voice(Bart)");
    }
}
