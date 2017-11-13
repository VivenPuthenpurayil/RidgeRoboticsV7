package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.Functions;

/**
 * Created by arulgupta on 9/29/17.
 */
@Autonomous(name="Autonomous System BLUE 1", group="Test")

public class AutonomousMainBlue1 extends Functions{

    public ElapsedTime runtime = new ElapsedTime();
    public team side = team.blue1;

    public void runOpMode() throws InterruptedException{
        super.setRuntime(runtime);
        Setup(setupType.jewel);

        waitForStart();
        runtime.reset();
        while (opModeIsActive()) {
            jewelDown.setPosition(0.6);
            jewelFlick.setPosition(0.6);
            sleep(2000);
            jewelSensor.enableLed(true);
            flick(side);
            sleep(3000);
            Backward(0.7, 18, 10,2000);


            break;
        }
    }
}



