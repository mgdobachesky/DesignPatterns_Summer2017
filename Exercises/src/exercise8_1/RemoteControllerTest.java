package exercise8_1;

public class RemoteControllerTest {

	public static void main(String[] args) {

		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		Light light = new Light();
		
		LightOnCommand lightOn = new LightOnCommand(light);
		
		remote.setCommand(lightOn);
		
		remote.buttonWasPressed();
		
		/////////////////////////////////////////////////////
		
		GarageDoor garageDoor = new GarageDoor();
		
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
		
		remote.setCommand(garageOpen);
		
		remote.buttonWasPressed();

	}

}
