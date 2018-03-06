package com.imp;

import com.interfaces.Hand;
import com.interfaces.Leg;
import com.interfaces.Robot;

public class MimicriesPolyAlloy extends AbstractRobot implements Robot {
    @Override
    public void printMe() {
        System.out.println("MimicriesPolyAlloy");
        super.printMe();
    }

    public MimicriesPolyAlloy(Hand hand, Leg leg, String colour) {
        super(hand, leg, colour);
    }


}
