package FinalPart2;

public class Controller implements RobotDecorator {
	private HumanoidRobot humanoidRobot;
	
	public Controller(HumanoidRobot humanoidRobot) {
		this.humanoidRobot = humanoidRobot;
	}

	@Override
	public String robotDetails() {
		return humanoidRobot.robotDetails() + "; with controller";
	}
	
}
