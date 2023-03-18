package org.firstinspires.ftc.teamcode.util.geometry;

public class GraphicalVector {

    double x,y;

    double r;

    Angle theta;

    enum VectorType{
        POLAR,
        RECTANGULAR;
    }

    public GraphicalVector(double x,double y) {
        this.x = x;
        this.y = y;
        this.r = Math.sqrt(x*x + y*y);
        this.theta =  new Angle(Math.atan(y/x) + (x<0? 180 : 0));
    }

    public GraphicalVector(double r, Angle theta) {

    }
}
