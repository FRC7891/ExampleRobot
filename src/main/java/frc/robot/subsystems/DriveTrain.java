/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.TankDrive;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
 private TalonSRX motorLeft1 = new TalonSRX(RobotMap.Motor_Left_1_ID);
 private TalonSRX motorLeft2 = new TalonSRX(RobotMap.Motor_Left_2_ID);
 private TalonSRX motorRight1 = new TalonSRX(RobotMap.Motor_Right_1_ID);
 private TalonSRX motorRight2 = new TalonSRX(RobotMap.Motor_Right_2_ID);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new TankDrive());
  }

  public void setLeftMotors(double speed){
    motorLeft1.set(ControlMode.PercentOutput, speed);
    motorLeft2.set(ControlMode.PercentOutput, speed);
  }
  public void setRightMotors(double speed){
    motorRight1.set(ControlMode.PercentOutput, -speed);
    motorRight2.set(ControlMode.PercentOutput, -speed);
  }
}
