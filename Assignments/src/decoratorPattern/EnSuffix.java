package decoratorPattern;

public class EnSuffix extends WordDecorator {
	RootWord rootWord;
	
	public EnSuffix(RootWord rootWord) {
		this.rootWord = rootWord;
	}
	
	public String definitionInfo() {
		return "made of " + rootWord.definitionInfo();
	}
	
	@Override 
	public String wordInfo() {
		return rootWord.wordInfo() + "en";
	}
}
