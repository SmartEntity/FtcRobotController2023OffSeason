package org.firstinspires.ftc.teamcode.util.geometry;

import java.sql.Ref;

public class Angle {

    enum AngleType{
        BEARING,
        DIRECTION,
        REFERENCE;
    }

    private double angle;
    private AngleType type;

    public Angle(double angle, AngleType type) {
        this.angle = angle;
        this.type = type;
    }

    public Angle(double angle) {
        this.angle = angle;
        this.type = AngleType.DIRECTION;
    }

    public double getAngle(){
        return angle;
    }

    public AngleType getType(){return type;}

    public double correctDomain(){
        this.angle = angle%360;
        return angle;
    }

    //TODO: make work
    /*public Angle toBearing(){
        if (this.type == AngleType.DIRECTION){
            this.angle
        }else if(this.type == AngleType.REFERENCE){

        }else{

        }
        this.type = AngleType.BEARING;
        return this;
    }

    public Angle toDirection(){

    }

    public Angle toReference(){

    }*/
}

