/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class VisionDrive extends Command {
  public VisionDrive() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.Drive);

  }
  private static final int IMG_WIDTH = 640;
  private static final int IMG_HEIGHT = 480;
 

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
 
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {

    
    double  centerX = Robot.centerX;

    double turn = centerX - (IMG_WIDTH / 2); //VALUE TO BE TESTED *NOT FINAL*
    boolean autoAlign;
    autoAlign = Robot.m_oi.stick1.getRawButton(1);
    if (autoAlign){
    Robot.Drive.teleopDrive(0.5, turn);
    }
    

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
