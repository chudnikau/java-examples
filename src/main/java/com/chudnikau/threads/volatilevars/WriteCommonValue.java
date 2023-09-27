package com.chudnikau.threads.volatilevars;

public class WriteCommonValue implements Runnable {

    private CommonClass commonClass;

    public WriteCommonValue(CommonClass commonClass) {
        this.commonClass = commonClass;
    }

    @Override
    public void run() {
        commonClass.setN(2);
    }
}
