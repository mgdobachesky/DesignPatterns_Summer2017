package FinalPart2;

public class RobotSimulation {

	public static void main(String[] args) {
		HumanoidRobot humanoidRobot = new VanillaRobot();
		
		System.out.println("~~ Plain Robot ~~");
		System.out.println(humanoidRobot.robotDetails());
		
		humanoidRobot = new Wheel(humanoidRobot);
		humanoidRobot = new Keyboard(humanoidRobot);
		humanoidRobot = new DiskDrive(humanoidRobot);
		humanoidRobot = new Controller(humanoidRobot);
		humanoidRobot = new Monitor(humanoidRobot);
		
		System.out.println();
		System.out.println("~~ Robot With Added Functionality ~~");
		System.out.println(humanoidRobot.robotDetails());
	}

}
