/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ClawMech extends Command {
  public ClawMech() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.clawPenumatics);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
public void execute() {
    boolean ClawButton;
    boolean ClawButtonRelease;

    //Buttons for Claw Grab and release
    ClawButton = Robot.m_oi.stick2.getRawButton(4);
    ClawButtonRelease = Robot.m_oi.stick2.getRawButton(3);
    
    if (ClawButton == true){
      if(true) {
        //closes the clamp and prints 
        System.out.println("Clamp Closed");
        Robot.clawPenumatics.Close();
      }
    }
    if (ClawButtonRelease == true)  {
      //Opens the Clamp when button 6 is pressed and prints
      Robot.clawPenumatics.Open();
      System.out.println("Clamp Opened");
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
