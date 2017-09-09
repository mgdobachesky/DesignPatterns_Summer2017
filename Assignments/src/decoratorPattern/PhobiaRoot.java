package decoratorPattern;

public class PhobiaRoot extends RootWord {
	
	public PhobiaRoot() {
		setDefinition("fear");
	}
	
	@Override
	public String wordInfo() {
		return "phobia";
	}
}
