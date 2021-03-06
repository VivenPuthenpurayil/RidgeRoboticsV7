package org.firstinspires.ftc.teamcode.Test;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.Functions;
import org.firstinspires.ftc.teamcode.FunctionsNew;

/**
 * Created by arulgupta on 9/29/17.
 */
@Autonomous(name="New Encoders Test", group="Test3")

public class TestNewEncoderStyle extends FunctionsNew {

    public ElapsedTime runtime = new ElapsedTime();

    public void runOpMode() throws InterruptedException{
        super.setRuntime(runtime);
        Setup(setupType.drive);

        waitForStart();
        runtime.reset();
        while (opModeIsActive()) {

            break;
        }
    }
}
