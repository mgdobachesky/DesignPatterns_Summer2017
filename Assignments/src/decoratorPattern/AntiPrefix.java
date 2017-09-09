package decoratorPattern;

public class AntiPrefix extends WordDecorator {
	RootWord rootWord;
	
	public AntiPrefix(RootWord rootWord) {
		this.rootWord = rootWord;
	}
	
	public String definitionInfo() {
		return "against " + rootWord.definitionInfo();
	}
	
	@Override 
	public String wordInfo() {
		return "anti" + rootWord.wordInfo();
	}
}
