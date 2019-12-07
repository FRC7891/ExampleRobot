
package frc.robot;
import com.studiohartman.jamepad.ControllerManager;

import edu.wpi.first.wpilibj.Joystick;

public class OI {
  private Joystick driverController = new Joystick(RobotMap.DRIVER_CONTROLLER);
  private static ControllerManager controller = new ControllerManager();
  public double GetDriverRawAxis(int axis){
    return driverController.getRawAxis(axis);

  }
  

  public OI(){
    controller.initSDLGamepad();
  }
}

