package com.chudnikau.override;

public class Homer {

    char doh(char c) {
        System.out.println("doh(char)");
        return 'd';
    }

    float doh(float f) {
        System.out.println("doh(float)");
        return 1.0f;
    }

    void voice() {
        System.out.println("voice(Homer)");
    }
}
