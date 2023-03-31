// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

  public static final int AUTO_BALANCE_THRESHOLD                          = 2;

  // Pneumatic Channels
  public static final int INTAKE_OUT_PNEUMATIC_ID                     = 14;
  public static final int INTAKE_IN_PNEUMATIC_ID                      = 1;
  public static final int BRAKE_OUT_PNEUMATIC_ID                      = 0;
  public static final int BRAKE_IN_PNEUMATIC_ID                       = 1;
  public static final int LIMELIGHT_IN_PNEUMATIC_CHANNEL              = 5;
  public static final int LIMELIGHT_OUT_PNEUMATIC_CHANNEL             = 10;
  

  // Motor IDs
  public static final int ARM_MOTOR_ID                                = 12;
  public static final int INTAKE_MOTOR_ID                             = 41;
  public static final int GRABBER_1_MOTOR_ID                          = 51;
  public static final int GRABBER_2_MOTOR_ID                          = 52;

  // Motor Speed
  public static final double ARM_MOTOR_SPEED_UP                       = 1;
  public static final double ARM_MOTOR_SPEED_DOWN                     = 0.5;
  public static final double INTAKE_IN_MOTOR_SPEED                    = 0.75;
  public static final double INTAKE_OUT_SLOW_MOTOR_SPEED              = 0.5;
  public static final double INTAKE_OUT_FAST_MOTOR_SPEED              = 1;
  public static final double INTAKE_OUT_MANUAL_MOTOR_SPEED            = 0.75;
  public static final double GRAB_MOTOR_SPEED                         = 0.75;
  public static final double RELEASE_MOTOR_SPEED                      = 0.45;
  public static final double RELEASE_FAST_MOTOR_SPEED_1               = 0.6;
  public static final double RELEASE_FAST_MOTOR_SPEED_2               = 0.5;

  public static final double ARM_GEAR_RATIO                           = 580; // 580 motor rev :1 arm rev

  // Arm Angles
  public static final double HOME_ARM_ANGLE                           = 12; //off vertical
  public static final double LEVEL_1_ARM_ANGLE                        = 28; //off vertical
  public static final double ROTATE_UP_LEVEL_1_ARM_ANGLE              = 25; //off vertical
  public static final double LEVEL_2_ARM_ANGLE                        = 73; //off vertical
  public static final double LEVEL_3_ARM_ANGLE                        = 92; //off vertical
  public static final double SUBSTATION_ARM_ANGLE                     = 81; //off vertical
  public static final double ARM_ANGLE_THRESHOLD                      = 0.5; // in degrees

  // Front left Swerve Module
  public static final int FRONT_LEFT_DRIVE_ID                         = 21;
  public static final int FRONT_LEFT_TURN_ID                          = 22;
  public static final int FRONT_LEFT_ENCODER_ID                       = 23;
  public static final double FRONT_LEFT_TURN_OFFSET                   = 0;

  // Back left Swerve Module
  public static final int BACK_LEFT_DRIVE_ID                          = 31;
  public static final int BACK_LEFT_TURN_ID                           = 32;
  public static final int BACK_LEFT_ENCODER_ID                        = 33;
  public static final double BACK_LEFT_TURN_OFFSET                    = 0;

  // Front Right Swerve Module
  public static final int FRONT_RIGHT_DRIVE_ID                        = 24;
  public static final int FRONT_RIGHT_TURN_ID                         = 25;
  public static final int FRONT_RIGHT_ENCODER_ID                      = 26;
  public static final double FRONT_RIGHT_TURN_OFFSET                  = 0;

  // Back Right Swerve Module
  public static final int BACK_RIGHT_DRIVE_ID                         = 34;
  public static final int BACK_RIGHT_TURN_ID                          = 35;
  public static final int BACK_RIGHT_ENCODER_ID                       = 36;
  public static final double BACK_RIGHT_TURN_OFFSET                   = 0; // in degrees

  // Drivetrain Velocities
  public static final double MAX_VELOCITY                             = 2;
  public static final double MAX_MOVE_VELOCITY                        = 2;
  public static final double MAX_TURN_VELOCITY                        = 2;
  public static final double MAX_MOVE_VELOCITY_FAST                   = 4.5;
  public static final double MAX_TURN_VELOCITY_FAST                   = 4.5;

  // Drivetrain Parameters
  public static final int MAX_VOLTAGE                                 = 12;
  public static final int DRIVE_CURRENT_LIMIT                         = 60;
  public static final int TURN_CURRENT_LIMIT                          = 25;
  public static final double MAX_MOVE_VELOCITY_SLOW                   = 0.4;
  public static final double MAX_TURN_VELOCITY_SLOW                   = 0.4;
  public static final boolean IS_FIELD_RELATIVE                       = true;
  public static final double OFFSET                                   = 180.0;
  public static final double DRIVETRAIN_TRACKWIDTH_METERS             = 0.8128; //32 in
  public static final double DRIVETRAIN_WHEELBASE_METERS              = 0.7112; //28 in
  public static final double DRIVETRAIN_GEAR_RATIO                    = 5.12; //For L2 Module
  public static final double WHEEL_DIAMETER                           = 0.09398; // 3.7 in
  public static final double DRIVE_CONVERSION                         = (WHEEL_DIAMETER * Math.PI) / DRIVETRAIN_GEAR_RATIO;
  public static final double TURN_CONVERSION                          = 12.8;
  
  public static final SwerveDriveKinematics DRIVE_KINEMATICS          = 
      new SwerveDriveKinematics(
          new Translation2d(DRIVETRAIN_WHEELBASE_METERS/ 2.0, DRIVETRAIN_TRACKWIDTH_METERS / 2.0), // front left
          new Translation2d(DRIVETRAIN_WHEELBASE_METERS/ 2.0, -DRIVETRAIN_TRACKWIDTH_METERS / 2.0), // front right
          new Translation2d(-DRIVETRAIN_WHEELBASE_METERS/ 2.0, DRIVETRAIN_TRACKWIDTH_METERS / 2.0), // back left
          new Translation2d(-DRIVETRAIN_WHEELBASE_METERS/ 2.0, -DRIVETRAIN_TRACKWIDTH_METERS / 2.0) // back right
      );


  // Drive PIDs
  public static final double DRIVE_P                                  = 0.1;
  public static final double DRIVE_I                                  = 0;
  public static final double DRIVE_D                                  = 0;
  public static final double DRIVE_FF                                 = 2.96;

  // Turn PIDs
  public static final double TURN_P                                   = 0.01;
  public static final double TURN_I                                   = 0;
  public static final double TURN_D                                   = 0.005;
  public static final double TURN_FF                                  = 0;

  // Controller Ports
  public static final int DRIVER_CONTROLLER_PORT                      = 0;
  public static final int OPERATOR_CONTROLLER_PORT                    = 1;
  public static final int MANUAL_OPERATOR_CONTROLLER_PORT             = 1;

  // Laser Break Ports
  public static final int GRABBER_LASER_BREAK_PORT                    = 0;
  public static final int INTAKE_LASER_BREAK_PORT                     = 2;

  // LED Ports
  public static final int LED_1_PWM_PORT                              = 9;
  public static final int LED_2_PWM_PORT                              = 0;
  
  // Vision Processor 
  public static final double END_DISTANCE = 2;                                  // the distance we want the robot to be from the target
  public static final double END_ANGLE = 2;                                     // the angle we want the robot to have from the target
  public static final double END_DISTANCE_THRESHOLD = 1;                       // the acceptable margin of error for distance from target
  public static final double END_ANGLE_THRESHOLD = 1;                           // the acceptable margin of error for angle from target
  public static final double CAMERA_ANGLE = 81;                                  // the angle of the camera to the ground           
  public static final double CAMERA_HEIGHT = 1;                                 // the height of the camera from the ground                     
  public static final double HEIGHT_OF_TARGET = 0.854075;                          // the mean of target height 1 and 2
  public static final double HEIGHT_OF_GRID_APRIL_TAG = 0.38735;           // the height of the grid april tag in relation to the camera
  public static final double HEIGHT_OF_SUBSTATION_APRIL_TAG = 0.619125;          // the height of the substation april tag in relation to the camera
  
}


