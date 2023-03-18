package org.firstinspires.ftc.teamcode.objects.robotcomponent;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.objects.Descriptor;
import org.firstinspires.ftc.teamcode.objects.Object;
import org.firstinspires.ftc.teamcode.objects.State;

public abstract class RobotComponent implements Object {
    private OpMode opMode;
    protected HardwareMap hardwareMap;
    protected Telemetry telemetry;

    public RobotComponent(OpMode opMode) {
        this.opMode = opMode;
        this.hardwareMap = opMode.hardwareMap;
        this.telemetry = opMode.telemetry;
    }

    public abstract boolean isBusy();
}
