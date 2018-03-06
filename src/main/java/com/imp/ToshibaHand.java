package com.imp;

import com.interfaces.Hand;

public class ToshibaHand implements Hand {
    @Override
    public void catchSmth() {
        System.out.println("Toshiba Hand");
    }
}
