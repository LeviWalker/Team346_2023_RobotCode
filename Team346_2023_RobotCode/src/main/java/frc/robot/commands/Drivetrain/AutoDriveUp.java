package frc.robot.commands.Drivetrain;

import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;
import frc.robot.subsystems.Drivetrain.Drivetrain;

/** An example command that uses an example subsystem. */
public class AutoDriveUp  extends CommandBase {

  Drivetrain drivetrain;
  double x;
  double y;
  double theta;

  public AutoDriveUp() {
    x = Constants.MAX_MOVE_VELOCITY;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    // ChassisSpeeds velocity = Constants.IS_FIELD_RELATIVE ? ChassisSpeeds.fromFieldRelativeSpeeds(x, 0, 0, drivetrain.getHeading()) 
    //   : new ChassisSpeeds(x, 0, 0);

    // drivetrain.drive(velocity, true);
    if (RobotContainer.drivetrain.getOnToChargeStation()) {
      System.out.println("command works");
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;//RobotContainer.drivetrain.getOnToChargeStation();
  }
}