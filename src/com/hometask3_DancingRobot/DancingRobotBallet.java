package com.hometask3_DancingRobot;

public class DancingRobotBallet extends DancingRobot{
    @Override
    public String getDanceType1() {
        return "Ballet";
    }

    @Override
    public String getDanceType2() {
        return null;
    }

    @Override
    public String getDefaultDanceType() {
        return super.getDefaultDanceType() + " or anything";
    }

    @Override
    public String toString() {
        return "Ballet robot dances " + getDefaultDanceType();
    }
}
