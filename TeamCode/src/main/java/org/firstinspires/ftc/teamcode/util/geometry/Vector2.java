package org.firstinspires.ftc.teamcode.util.geometry;

public abstract class Vector2 {
    private double val1, val2;

    public Vector2(double val1, double val2){
        this.val1 = val1;
        this.val2 = val2;
    }

    public abstract Vector2 add(Vector2 other);

    public abstract Vector2 subtract(Vector2 other);

    public abstract Vector2 scale(double scalar);

    public abstract Vector2 rotate(double angle);

    public abstract double magnitude();
}


