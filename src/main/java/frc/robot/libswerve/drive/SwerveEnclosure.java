package frc.robot.libswerve.drive;

/**
 * The interface representing an abstract Swerve Drive enclosure
 */
public interface SwerveEnclosure {
	
	/**
	 * @return the name of the enclosure (e.g. "front-right").
	 */
	String getName();

    /**
     * Move the wheel in a certain direction and speed.
     * @param speed: the speed to move the wheel, -1.0 being full backwards, 0 being stop +1.0 being full forward
     * @param angle: the angle to turn the wheel, 0 being forward, -1.0 being full turn counterclockwise, +1.0 being full turn clockwise
     */
    void move(double speed, double angle);

    /**
     * Stop all movement of the wheel
     */
    void stop();
}
