package org.firstinspires.ftc.teamcode.robot.drivetrain;

import static org.firstinspires.ftc.teamcode.robot.drivetrain.DrivetrainDescriptor.DrivetrainBreakCase.*;
import static org.firstinspires.ftc.teamcode.robot.drivetrain.DrivetrainDescriptor.DrivetrainState.*;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.robot.abstraction.Component;

public class Drivetrain extends Component {
    private DrivetrainDescriptor driveTrainDescriptor;

    public Drivetrain(DrivetrainDescriptor descriptor) {
        super(descriptor);
        this.driveTrainDescriptor = descriptor;
    }

    @Override
    public void run() {
        if(driveTrainDescriptor.states.isEmpty() && driveTrainDescriptor.breakCases.isEmpty()){
            driveTrainDescriptor.states.add(IDLE);
            driveTrainDescriptor.breakCases.add(NEW_COMMAND);
        }
        switch (driveTrainDescriptor.states.get(0)){
            case IDLE:
                if (stop()){
                    driveTrainDescriptor.states.remove(0);
                    driveTrainDescriptor.breakCases.remove(0);
                }
                break;
        }
    }

    @Override
    public boolean stop() {
        switch (driveTrainDescriptor.breakCases.get(0)){
            case NEW_COMMAND:
                return driveTrainDescriptor.states.get(1) != null;
            case REACHED_TARGET_POS:
                return driveTrainDescriptor.position == driveTrainDescriptor.targetPosition;        }
        return false;
    }


}
