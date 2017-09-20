package FinalPart2;

public class Wheel implements RobotDecorator  {
	private HumanoidRobot humanoidRobot;
	
	public Wheel(HumanoidRobot humanoidRobot) {
		this.humanoidRobot = humanoidRobot;
	}

	@Override
	public String robotDetails() {
		return humanoidRobot.robotDetails() + "; with wheel";
	}
}
