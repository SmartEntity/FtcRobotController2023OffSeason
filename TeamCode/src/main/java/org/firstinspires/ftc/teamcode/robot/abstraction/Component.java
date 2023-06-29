package org.firstinspires.ftc.teamcode.robot.abstraction;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.Telemetry;

import java.util.ArrayList;
import java.util.List;

public abstract class Component {
    protected ElapsedTime commandTime;
    protected Descriptor descriptor;

    public Component(Descriptor descriptor) {
        this.commandTime =  new ElapsedTime();
        this.descriptor = descriptor;
    }

    protected abstract void run();

    protected abstract boolean stop();
}
