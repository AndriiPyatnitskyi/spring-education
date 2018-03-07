package com.imp;

import com.interfaces.Hand;
import org.springframework.beans.factory.InitializingBean;

public class SonyHand implements Hand{
    @Override
    public void catchSmth() {
        System.out.println("Sony Hand");
    }

}
