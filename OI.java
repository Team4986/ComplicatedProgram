package org.usfirst.frc.team4986.SmartBot;







import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;





public class OI{
Joystick left=new Joystick(0);
Joystick right=new Joystick(1);

public Joystick getleft(){
    return left;
  }
public Joystick getright(){
    return right;
  }
  
  
