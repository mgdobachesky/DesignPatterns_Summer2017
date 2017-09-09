package decoratorPattern;

public class EstSuffix extends WordDecorator{
	RootWord rootWord;
	
	public EstSuffix(RootWord rootWord) {
		this.rootWord = rootWord;
	}
	
	public String definitionInfo() {
		return "the most " + rootWord.definitionInfo();
	}
	
	@Override 
	public String wordInfo() {
		return rootWord.wordInfo() + "est";
	}
}
