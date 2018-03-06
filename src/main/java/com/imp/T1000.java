package com.imp;

import com.interfaces.Hand;
import com.interfaces.Leg;
import com.interfaces.Robot;

public class T1000 extends AbstractRobot implements Robot {
    public T1000(Hand hand, Leg leg, String colour) {
        super(hand, leg, colour);
    }

    public T1000() {
    }

    @Override
    public void printMe() {
        System.out.println("T1000");
        super.printMe();
    }

    public void initT1000(){
        System.out.println("@@@ init T1000 @@@");
    }


    private void destroyT1000() {
        System.out.println("@@@ destroy T1000 @@@");
    }
}