package FinalPart2;

public class Monitor implements RobotDecorator {
	private HumanoidRobot humanoidRobot;
	
	public Monitor(HumanoidRobot humanoidRobot) {
		this.humanoidRobot = humanoidRobot;
	}

	@Override
	public String robotDetails() {
		return humanoidRobot.robotDetails() + "; with monitor";
	}
}
