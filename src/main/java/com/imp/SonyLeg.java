package com.imp;

import com.interfaces.Leg;
import org.springframework.beans.factory.InitializingBean;

public class SonyLeg implements Leg, InitializingBean {
    @Override
    public void leg() {
        System.out.println("Sony Leg");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet" + toString());
    }
}
