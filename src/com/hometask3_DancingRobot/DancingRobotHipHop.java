package com.hometask3_DancingRobot;

public class DancingRobotHipHop extends DancingRobot{
    @Override
    public String getDanceType1() {
        return "Hip-hop";
    }

    @Override
    public String getDanceType2() {
        return null;
    }

    @Override
    public String toString() {
        return "Hip-hop robot dances " + getDefaultDanceType();
    }
}
