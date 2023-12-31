/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class HatchCommand extends Command {
  public HatchCommand() {
    // Use requires() here to declare subsystem dependencies
     requires(Robot.HatchMove);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    double HatchControl = Robot.m_oi.stick2.getRawAxis(5); // SECOND JOYSTICK: RIGHT STICK
    Robot.HatchMove.hatchUp(HatchControl);
    //Move Up *****************************
    /*
   
    if (HatchButtonUp == true){
      Robot.HatchMove.hatchUp(0.5);
    }else if (HatchButtonDown){
      Robot.HatchMove.hatchUp(-0.5);
    } else{
      Robot.HatchMove.hatchUp(0);
    }

*/
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
