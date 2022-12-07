// subsystem

package frc.robot.subsystems;

import frc.robot.Constants;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


@Override

public class servoMotor extends SubsystemBase  {

    // Servo idenified

    private final Servo m_sServo = new Servo(1);
    private double m_servoPos;
    

    // creates a new subsystem

    public servoMotor(){
        reset();
    }

    // angles / rotational angle for servo motor

    public void reset() {

        private final m_sServo.set(0.5);
        private final m_sServo.setAngle(75);
    
    }
}
