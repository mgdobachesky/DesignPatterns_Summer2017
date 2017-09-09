package decoratorPattern;

public class WordGenerator {
	public static void main(String args[]) {
		RootWord myWord = new TechnoRoot();
		System.out.println("Word: " + myWord.wordInfo());
		System.out.println("Definition: " + myWord.definitionInfo());
		
		System.out.println();
		
		RootWord myWord1 = new PhobiaRoot();
		myWord1 = new AntiPrefix(myWord1);
		System.out.println("Word: " + myWord1.wordInfo());
		System.out.println("Definition: " + myWord1.definitionInfo());
		
		System.out.println();
		
		RootWord myWord2 = new AquaRoot();
		myWord2 = new FulSuffix(myWord2);
		System.out.println("Word: " + myWord2.wordInfo());
		System.out.println("Definition: " + myWord2.definitionInfo());
		
		System.out.println();
		
		RootWord myWord3 = new ChronRoot();
		myWord3 = new EnSuffix(myWord3);
		myWord3 = new RePrefix(myWord3);
		System.out.println("Word: " + myWord3.wordInfo());
		System.out.println("Definition: " + myWord3.definitionInfo());
		
		System.out.println();
		
	}
}
