package decoratorPattern;

public class ChronRoot extends RootWord {
	
	public ChronRoot() {
		setDefinition("time");
	}
	
	@Override
	public String wordInfo() {
		return "chron";
	}
}
