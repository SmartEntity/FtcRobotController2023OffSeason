package org.firstinspires.ftc.teamcode.geometry;

public class GraphicalVector{
    Scalar x;
    Scalar y;

    Scalar r;
    Angle theta;

    public GraphicalVector(Scalar x, Scalar y) {
        this.x = x;
        this.y = y;
        updatePolar();
    }

    public GraphicalVector(Scalar r, Angle theta) {
        this.r = r;
        this.theta = theta;
        updateRectangular();
    }

    GraphicalVector add(GraphicalVector other){
        this.x.val += other.x.convertUnitsTo(this.x.unit).val;
        this.y.val += other.y.convertUnitsTo(this.y.unit).val;
        updatePolar();
        return this;
    }

    GraphicalVector add(double x, double y){
        this.x.val += x;
        this.y.val += y;
        updatePolar();
        return this;
    }

    GraphicalVector subtract(GraphicalVector other){
        this.x.val -= other.x.convertUnitsTo(this.x.unit).val;
        this.y.val -= other.y.convertUnitsTo(this.y.unit).val;
        updatePolar();
        return this;
    }

    GraphicalVector subtract(double x, double y){
        this.x.val -= x;
        this.y.val -= y;
        updatePolar();
        return this;
    }

    GraphicalVector scale(Scalar scalar){
        this.r.val *= scalar.convertUnitsTo(Scalar.ScalarUnit.UNITS).val;
        updateRectangular();
        return this;
    }

    GraphicalVector scale(double scalar){
        this.r.val *= scalar;
        updateRectangular();
        return this;
    }

    GraphicalVector rotate(Angle angle){
        this.theta.val += angle.convertUnitTo(this.theta.unit).convertDirectionTo(this.theta.direction).val;
        updateRectangular();
        return this;
    }

    GraphicalVector rotate(double angle){
        this.theta.val += angle;
        updateRectangular();
        return this;
    }

    private void updateRectangular(){
        x.val = Math.cos(theta.val)*(r.val);
        y.val = Math.sin(theta.val)*(r.val);
    }

    private void updatePolar(){
        r.val = Math.sqrt(x.val*x.val+y.val*y.val);
        theta.val = Math.atan(y.val/x.val); //not correct, current a reference angle
    }
}
