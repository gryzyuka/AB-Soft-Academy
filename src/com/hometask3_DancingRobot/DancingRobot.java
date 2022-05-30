package com.hometask3_DancingRobot;

public abstract class DancingRobot {

    public abstract String getDanceType1();

    public abstract String getDanceType2();

    public String getDefaultDanceType() {
        return getDanceType1();
    }

}
