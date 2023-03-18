package org.firstinspires.ftc.teamcode.objects.robotcomponent;

import android.annotation.SuppressLint;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotorEx;

import org.firstinspires.ftc.teamcode.objects.Descriptor;
import org.firstinspires.ftc.teamcode.objects.State;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressLint("DefaultLocale")
public class DriveTrain extends RobotComponent {
    //constructor
    OpMode opMode;
    DrivetrainDescriptor driveTrainDescriptor = new DrivetrainDescriptor();
    List<DrivetrainState> drivetrainState = new ArrayList<DrivetrainState>();
    Boolean switchCase[];

    private DcMotorEx frontLeft;
    private DcMotorEx frontRight;
    private DcMotorEx backLeft;
    private DcMotorEx backRight;
    private List<DcMotorEx> motors;

    @Override
    public Descriptor getDescriptor() {
        return this.driveTrainDescriptor;
    }

    @Override
    public State getState() {
        return this.drivetrainState.get(0);
    }

    public DriveTrain(OpMode opMode) {
        super(opMode);
        switchCase[0] = false;
        frontLeft = (DcMotorEx) hardwareMap.dcMotor.get(driveTrainDescriptor.frontLeftName);
        frontRight = (DcMotorEx) hardwareMap.dcMotor.get(driveTrainDescriptor.frontRightName);
        backLeft = (DcMotorEx) hardwareMap.dcMotor.get(driveTrainDescriptor.backLeftName);
        backRight = (DcMotorEx) hardwareMap.dcMotor.get(driveTrainDescriptor.backRightName);
        motors = Arrays.asList(frontLeft, frontRight, backLeft, backRight);

    }

    @Override
    public boolean isBusy() {
        return drivetrainState.get(0) != DrivetrainState.IDLE;
    }

    @Override
    public void run() {
        switch (drivetrainState.get(0)){
            case IDLE:
                break;
            case INIT:
                break;
            case MOVE:
                break;
            case STOP:
                break;
            case SET_TARGET_POS:
                break;
        }
    }

}

enum DrivetrainState implements State {
    IDLE(0),
    INIT(1),
    MOVE(2),
    STOP(3),
    SET_TARGET_POS(4);

    private final int value;

    DrivetrainState(int value) {
        this.value = value;
    }

    @Override
    public double val() {
        return value;
    }
}

class DrivetrainDescriptor extends Descriptor {
    //motors
    public int motorRPM = 0;
    public int ticksPerRevolution = 0;

    //hardwaremap
    public String frontLeftName = "frontLeft";
    public String frontRightName = "frontRight";
    public String backRightName = "backRight";
    public String backLeftName = "backLeft";

    //wheel
    public double wheelCircumferenceInMM = 96;

    //
}