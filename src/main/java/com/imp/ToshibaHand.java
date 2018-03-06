package com.imp;

import com.interfaces.Hand;
import org.springframework.beans.factory.InitializingBean;

public class ToshibaHand implements Hand, InitializingBean {
    @Override
    public void catchSmth() {
        System.out.println("Toshiba Hand");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet" + toString());
    }
}
