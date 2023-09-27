package com.chudnikau.threads.volatilevars;

public class ReadCommonValue implements Runnable {

    private CommonClass commonClass;

    public ReadCommonValue(CommonClass commonClass) {
        this.commonClass = commonClass;
    }

    @Override
    public void run() {
        System.out.println(commonClass.getN());
    }
}
