package org.firstinspires.ftc.teamcode.util.geometry;

import static org.firstinspires.ftc.teamcode.util.geometry.PolarVector.*;

public class RectangularVector extends Vector2{
    private double x,y;

    public RectangularVector(double x, double y) {
        super(x,y,VectorType.POLAR);
        this.x = x;
        this.y = y;
    }

    public PolarVector toPolar(){
        double r = Math.sqrt(x*x + y*y);
        Angle theta = new Angle(Math.atan(y/x) + (x<0? 180 : 0));  //TODO: implement with a toDirectionAngle(); method
        return new PolarVector(r,theta.correctDomain());
    }


    @Override
    public RectangularVector add(Vector2 other) {
        return null;
    }

    @Override
    public RectangularVector subtract(Vector2 other) {
        return null;
    }

    @Override
    public RectangularVector scale(double scalar) {
        return null;
    }

    @Override
    public RectangularVector rotate(double angle) {
        return null;
    }

    @Override
    public double magnitude() {
        return 0;
    }

}
