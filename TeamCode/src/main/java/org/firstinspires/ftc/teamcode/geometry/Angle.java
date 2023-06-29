package org.firstinspires.ftc.teamcode.geometry;

public class Angle {
    double val;
    AngleUnit unit;
    AngleDirection direction;

    Angle convertUnitTo(AngleUnit newUnit){
        this.val *= this.unit.conversionList[newUnit.conversionIndex];
        this.unit = newUnit;
        return this;
    }

    //TODO
    Angle convertDirectionTo(AngleDirection newDirection){
        this.val = this.direction.conversionList[newDirection.conversionIndex];
        return this;
    }

    double toDomain(double input){
        return input%this.unit.maxDomain;
    }

    enum AngleUnit{
        Radians(2*Math.PI,0,1,180/Math.PI),
        Degrees(360,1,Math.PI/180,1);

        int conversionIndex;
        double[] conversionList;
        double maxDomain;

        AngleUnit(double maxDomain,int conversionIndex, double ... conversionList) {
            this.conversionIndex = conversionIndex;
            this.conversionList = conversionList;
            this.maxDomain = maxDomain;
        }
    }
    enum AngleDirection{
        //TODO: fill in conversionList
        BEARING     (0,1),
        QUAD1       (1,0,1),
        QUAD2       (2),
        QUAD3       (3),
        QUAD4       (4),
        DIRECTION   (5);

        final int conversionIndex;
        final double[] conversionList;
        AngleDirection(int conversionIndex, double... conversionList) {
            this.conversionIndex = conversionIndex;
            this.conversionList = conversionList;
        }
    }



}
