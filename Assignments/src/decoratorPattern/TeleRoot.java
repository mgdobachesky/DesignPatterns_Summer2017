package decoratorPattern;

public class TeleRoot extends RootWord {
	
	public TeleRoot() {
		setDefinition("far off");
	}
	
	@Override
	public String wordInfo() {
		return "tele";
	}
}
