package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class LED extends SubsystemBase{
    private static Spark LED1;
    private static Spark LED2;

    public LED() {
        LED1 = new Spark(Constants.LED_1_PWM_PORT);
        LED2 = new Spark(Constants.LED_2_PWM_PORT);
    }
    // Changes LED to yellow for a cone
    public void cone() {
        LED1.set(0.69); //Yellow
    }

    // Changes LED to purple for a cube
    public void cube() {
        LED1.set(0.91); //Purple
    }

    // Changes LED to red for a Single Substation
    public void singleSubstation() {
        LED2.set(0.61); //Red
    }

    // Changes LED to Green for a Double Substation
    public void doubleSubstation() {
        LED2.set(0.77); //Green
    }
}
