package decoratorPattern;

public class RePrefix extends WordDecorator {
	RootWord rootWord;
	
	public RePrefix(RootWord rootWord) {
		this.rootWord = rootWord;
	}
	
	public String definitionInfo() {
		return "again " + rootWord.definitionInfo();
	}
	
	@Override 
	public String wordInfo() {
		return "re" + rootWord.wordInfo();
	}
}
