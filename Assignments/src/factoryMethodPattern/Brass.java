package factoryMethodPattern;

// Concrete Creator

public class Brass extends InstrumentFamily {
	// Define the Factory Method
	protected Instrument createInstrument(String type) {
		if(type.equalsIgnoreCase("trumpet")) {
			return new Trumpet();
		} else if(type.equalsIgnoreCase("trombone")) {
			return new Trombone();
		} else if(type.equalsIgnoreCase("tuba")) {
			return new Tuba();
		} else return null;
	}
}
