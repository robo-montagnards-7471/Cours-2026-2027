package frc.robot.components;

import edu.wpi.first.wblibj.motorcontrokl.PWMSparkFlex;
import frc.robot.data.Config;

public class DriveFrame {
   public DriveFrme() {
     PWMSparkFlex left_motor_controller = new PWMSparkFlex( Config.left_motor_port );
     left_motor_controller. setInverted(false);
     PWMSparkFlex right_motor_controller = new PWMSparkFlex( Config.right_motor_port );
     left_motor_controller. setInverted(true);
   }
}