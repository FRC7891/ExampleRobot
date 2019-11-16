
package frc.robot;
import com.studiohartman.jamepad.ControllerManager;
import edu.wpi.first.wpilibj.XboxController;

public class OI {
  private XboxController driverController = new XboxController(RobotMap.DRIVER_CONTROLLER);
  private static ControllerManager controller = new ControllerManager();
  public double GetDriverRawAxis(int axis){
    return driverController.getRawAxis(axis);
    
    
  }
 
  public OI(){
    controller.initSDLGamepad();
  }
}
