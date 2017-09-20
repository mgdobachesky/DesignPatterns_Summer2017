package FinalPart1;

public class RemoteLoader {

	public static void main(String[] args) {
		
		// Create remote control
		RemoteControl remoteControl = new RemoteControl();
		
		// Create devices
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor();
		Stereo stereo = new Stereo("Living Room");
		
		// Create commands
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		
		GarageDoorOpenCommand garageDoorUp = new GarageDoorOpenCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
		
		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		
		// Set and test macro commands
		remoteControl.setMacroCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setMacroCommand(0, kitchenLightOn, kitchenLightOff);
		remoteControl.setMacroCommand(0, ceilingFanOn, ceilingFanOff);
		remoteControl.setMacroCommand(0, stereoOnWithCD, stereoOff);
		remoteControl.setMacroCommand(0, garageDoorUp, garageDoorDown);
		
		System.out.println("~~ Macro On Pushed ~~");
		remoteControl.macroOnButtonWasPushed(0);
		System.out.println();
		System.out.println("~~ Macro Off Pushed ~~");
		remoteControl.macroOffButtonWasPushed(0);
	}

}
