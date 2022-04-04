// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.math.trajectory.Trajectory;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Robot;
import frc.robot.RobotContainer;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class ComplexAuto extends SequentialCommandGroup {
  /** Creates a new ComplexAuto. */
  public ComplexAuto(Trajectory first, Trajectory second, Trajectory third, Trajectory fourth) {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(new PathIntake(second, 1, 100), new PathHopper(first), /*RobotContainer.m_drivetrain.getAutonomousCommand(first),*/ new DriveToRange("short"), new dumbShooter(150)/*new ShooterSequence()*/, new ComplexAutoP2(third, fourth)); //RobotContainer.m_drivetrain.getAutonomousCommand(fourth));
  }
}
