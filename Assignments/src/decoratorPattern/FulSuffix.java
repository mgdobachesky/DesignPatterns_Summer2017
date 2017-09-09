package decoratorPattern;

public class FulSuffix extends WordDecorator {
	RootWord rootWord;
	
	public FulSuffix(RootWord rootWord) {
		this.rootWord = rootWord;
	}
	
	public String definitionInfo() {
		return "full of " + rootWord.definitionInfo();
	}
	
	@Override 
	public String wordInfo() {
		return rootWord.wordInfo() + "ful";
	}
}
