package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import frc.robot.data.Config;
import frc.robot.data.StickPosition;

public class Controller {
    private final XboxController hardware_controller;

    public Controller() {
        this.hardware_controller = new XboxController( Config.command_port );
    }

    public StickPosition getLeftJoyStickPosition() {
        return new StickPosition( hardware_controller.getLeftX(), hardware_controller.getLeftY() );
    }

    public StickPosition getRightJoyStickPosition() {
        return new StickPosition( hardware_controller.getRightX(), hardware_controller.getRightY() );
    }
}
