/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.elevatorMove;


/**
 * Add your docs here.
 */
public class Elevator extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
	public WPI_VictorSPX elevator1 = new WPI_VictorSPX(RobotMap.elevator1Channel);
  public WPI_VictorSPX elevator2 = new WPI_VictorSPX(RobotMap.elevator2Channel);
  public WPI_VictorSPX elevator3 = new WPI_VictorSPX(RobotMap.elevator3Channel);
  public WPI_VictorSPX elevator4 = new WPI_VictorSPX(RobotMap.elevator4Channel);
  
  public void moveElevator(double move){
    if (move<0){

    elevator1.set(ControlMode.PercentOutput, -move*0.7);
    elevator2.set(ControlMode.PercentOutput, -move*0.7);
    elevator3.set(ControlMode.PercentOutput, -move*0.7);
    elevator4.set(ControlMode.PercentOutput, -move*0.7);

    }
    if (move>0){

      elevator1.set(ControlMode.PercentOutput, -move*0.15);
      elevator2.set(ControlMode.PercentOutput, -move*0.15);
      elevator3.set(ControlMode.PercentOutput, -move*0.15);
      elevator4.set(ControlMode.PercentOutput, -move*0.15);
    }
  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
     setDefaultCommand(new elevatorMove());
  }
}
