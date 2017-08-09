package factoryMethodPattern;

// Concrete Creator

public class Strings extends InstrumentFamily {
	// Define the Factory Method
	protected Instrument createInstrument(String type) {
		if(type.equalsIgnoreCase("violin")) {
			return new Violin();
		} else if(type.equalsIgnoreCase("viola")) {
			return new Viola();
		} else if(type.equalsIgnoreCase("cello")) {
			return new Cello();
		} else return null;
	}
}
