package FinalPart2;

public class Keyboard implements RobotDecorator {
	private HumanoidRobot humanoidRobot;
	
	public Keyboard(HumanoidRobot humanoidRobot) {
		this.humanoidRobot = humanoidRobot;
	}

	@Override
	public String robotDetails() {
		return humanoidRobot.robotDetails() + "; with keyboard";
	}
}
