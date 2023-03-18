package org.firstinspires.ftc.teamcode.util.geometry;

import static org.firstinspires.ftc.teamcode.util.geometry.RectangularVector.*;

public class PolarVector extends Vector2{
    private double r;
    private Angle theta;

    public PolarVector(double r, Angle theta) {
        super(r,theta.getAngle(),VectorType.POLAR);
        this.r=r;
        this.theta=theta;
    }

    public PolarVector(double r, double theta) {
        super(r,theta,VectorType.POLAR);
        this.r=r;
        this.theta=new Angle(theta);
    }

    public double getR(){
        return r;
    }

    public Angle getTheta(){
        return theta;
    }

    public RectangularVector toRectangular(){
        double x = r*Math.cos(Math.toRadians(theta.getAngle()));
        double y = r*Math.sin(Math.toRadians(theta.getAngle()));
        return new RectangularVector(x,y);
    }

    @Override
    public PolarVector add(Vector2 other) {
        return this.toRectangular().add(other.).toPolar();
    }

    @Override
    public PolarVector subtract(Vector2 other) {
        return null;
    }

    @Override
    public PolarVector scale(double scalar) {
        this.r *= scalar;
        return this;
    }

    @Override
    public PolarVector rotate(double angle) {
        this.theta = new Angle(theta.getAngle()+angle,theta.getType());
        return this;
    }

    @Override
    public double magnitude() {
        return r;
    }
}
