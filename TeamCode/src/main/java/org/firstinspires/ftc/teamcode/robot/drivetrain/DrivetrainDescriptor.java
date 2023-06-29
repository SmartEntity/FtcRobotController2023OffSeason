package org.firstinspires.ftc.teamcode.robot.drivetrain;

import static org.firstinspires.ftc.teamcode.geometry.Scalar.ScalarUnit.*;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.geometry.Scalar;
import org.firstinspires.ftc.teamcode.robot.abstraction.Descriptor;
import org.firstinspires.ftc.teamcode.robot.drivetrain.drive.util.MotorPowers;
import org.firstinspires.ftc.teamcode.geometry.Vector2;

import java.util.ArrayList;
import java.util.List;

public class DrivetrainDescriptor extends Descriptor {
    public DrivetrainDescriptor(OpMode opMode) {
        super(opMode);
    }

    //Ticks per revolution
    double tpr;

    //motors
    DcMotor frontLeft = hardwareMap.dcMotor.get("frontLeft");
    DcMotor frontRight = hardwareMap.dcMotor.get("frontRight");
    DcMotor backLeft = hardwareMap.dcMotor.get("backLeft");
    DcMotor backRight = hardwareMap.dcMotor.get("backRight");


    //motorPower
    final MotorPowers motorPowers = new MotorPowers(0,0,0,0);

    //driveutil
    //final DriveUtil driveUtil;

    //dimensions of bot
    final Vector2 size = new Vector2(0,0);

    //dimensions of wheel
    final Scalar wheelSize = new Scalar(0, CENTIMETERS);

    /**********************************************************************************************/

    //position
    Vector2 position;

    Vector2 targetPosition;
    public List<DrivetrainState> states = new ArrayList<>();
    enum DrivetrainState {
        IDLE;
    }
    public List<DrivetrainBreakCase> breakCases = new ArrayList<>();

    enum DrivetrainBreakCase {
        NEW_COMMAND,
        REACHED_TARGET_POS,
        STICK_IDLE;
    }

}


