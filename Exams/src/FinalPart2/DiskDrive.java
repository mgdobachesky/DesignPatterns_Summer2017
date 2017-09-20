package FinalPart2;

public class DiskDrive implements RobotDecorator {
	private HumanoidRobot humanoidRobot;
	
	public DiskDrive(HumanoidRobot humanoidRobot) {
		this.humanoidRobot = humanoidRobot;
	}

	@Override
	public String robotDetails() {
		return humanoidRobot.robotDetails() + "; with disk drive";
	}
}
