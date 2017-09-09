package decoratorPattern;

public abstract class RootWord {
	// Properties
	private String definition;
	
	// Getters & Setters
	public String definitionInfo() {
		return definition;
	}
	public void setDefinition(String definition) {
		this.definition = definition;
	}
	
	// Abstract Methods
	public abstract String wordInfo();
	
}
