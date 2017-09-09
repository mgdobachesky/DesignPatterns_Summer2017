package decoratorPattern;

public class SuperPrefix extends WordDecorator {
	RootWord rootWord;
	
	public SuperPrefix(RootWord rootWord) {
		this.rootWord = rootWord;
	}
	
	public String definitionInfo() {
		return "above; beyond " + rootWord.definitionInfo();
	}
	
	@Override 
	public String wordInfo() {
		return "super" + rootWord.wordInfo();
	}
}
