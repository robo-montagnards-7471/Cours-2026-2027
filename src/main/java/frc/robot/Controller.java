package frc.robot;

import frc.robot.data.Config;
import frc.robot.data.StickPosition;
import edu.wpi.first.wpilibj.XboxController;

public class Controller {
    private final XboxController hardware_controller;

    public Controller() {
        this.hardware_controller = new XboxController( Config.command_port );
    }

    public StickPosition getLeftJoystickPosition() {
        return new StickPosition( hardware_controller.getLeftX(), hardware_controller.getLeftY() );
    }

    public StickPosition getRightJoystickPosition() {
        return new StickPosition( hardware_controller.getRightX(), hardware_controller.getRightY() );
    }
}
