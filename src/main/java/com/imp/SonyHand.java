package com.imp;

import com.interfaces.Hand;

public class SonyHand implements Hand {
    @Override
    public void catchSmth() {
        System.out.println("Sony Hand");
    }
}
