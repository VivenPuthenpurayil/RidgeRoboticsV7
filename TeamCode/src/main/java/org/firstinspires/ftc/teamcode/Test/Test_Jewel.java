package org.firstinspires.ftc.teamcode.Test;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.Functions;

/**
 * Created by arulgupta on 9/29/17.
 */
@Autonomous(name="Jewel System", group="Test2")

public class Test_Jewel extends Functions {

    public ElapsedTime runtime = new ElapsedTime();

    public void runOpMode() throws InterruptedException{
        super.setRuntime(runtime);
        Setup(setupType.glyph);

        waitForStart();
        runtime.reset();
        while (opModeIsActive()) {
            FlickDown();
            sleep(5000);
            FlickUp();
            sleep(2000);

            break;
        }
    }
}
