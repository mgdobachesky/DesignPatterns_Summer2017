package decoratorPattern;

public class TechnoRoot extends RootWord {
	
	public TechnoRoot() {
		setDefinition("art; science; skill");
	}
	
	@Override
	public String wordInfo() {
		return "techno";
	}
}
