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

    //создавался для вызова из init-method, default-init-method
    public void initT1000(){
        System.out.println("@@@ init T1000 @@@");
    }

    //создавался для вызова из destroy-method, default-destroy-method
    private void destroyT1000() {
        System.out.println("@@@ destroy T1000 @@@");
    }
}