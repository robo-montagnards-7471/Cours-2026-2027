package frc.robot;

import frc.robot.data.Config;
import frc.robot.data.StickPosition;
import edu.wpi.first.wpilibj.XboxController;

public class Controller {
    private final XboxController hardware_Controller;

    public Controller(){
        this.hardware_Controller = new XboxController(Congig.command_port);
    }
    
    public StickPosition getLeftJoystickPosition(){
        return new StickPosition(hardware_Controller.getLeftX(), hardware_Controller.getLeftY());
    }

      public StickPosition getRightJoystickPosition(){
        return new StickPosition(hardware_Controller.getRightX(), hardware_Controller.getRightY());
    }
    
}
