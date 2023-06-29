package org.firstinspires.ftc.teamcode.robot.drivetrain.drive.util;

import android.annotation.SuppressLint;

public class MotorPowers {

    public double backLeft;
    public double backRight;
    public double frontLeft;
    public double frontRight;

    public MotorPowers(double backLeft, double backRight, double frontLeft, double frontRight) {
        this.backLeft = backLeft;
        this.backRight = backRight;
        this.frontLeft = frontLeft;
        this.frontRight = frontRight;
    }

    //TODO
    //public void set();

    public void setBackLeft(double backLeft) {
        this.backLeft = backLeft;
    }

    public void setBackRight(double backRight) {
        this.backRight = backRight;
    }

    public void setFrontLeft(double frontLeft) {
        this.frontLeft = frontLeft;
    }

    public void setFrontRight(double frontRight) {
        this.frontRight = frontRight;
    }

    @SuppressLint("DefaultLocale")
    public String toString() {
        return String.format(
                "BL %.2f, BR %.2f, FL %.2f, FR %.2f",
                backLeft, backRight, frontLeft, frontRight
        );
    }
}