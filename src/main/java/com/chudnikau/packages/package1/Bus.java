package com.chudnikau.packages.package1;

public class Bus {

    /*
    The startEngine method should be as public otherwise it is not available outside the package
     */
    public void startEngine() {
        System.out.println(getClass().getName() +  " engine has been started");
    }
}
