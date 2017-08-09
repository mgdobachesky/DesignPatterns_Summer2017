package factoryMethodPattern;

// Client

public class InstrumentFactoryTest {
	public static void main(String[] args) {
		// Create two families of instruments
		InstrumentFamily strings = new Strings();
		InstrumentFamily brass = new Brass();
		
		// Create some instruments
		Instrument violin = strings.makeInstrument("violin");
		System.out.println(violin.getType() + " ready to use!");
		System.out.println();
		
		Instrument viola = strings.makeInstrument("viola");
		System.out.println(viola.getType() + " ready to use!");
		System.out.println();
		
		Instrument cello = strings.makeInstrument("cello");
		System.out.println(cello.getType() + " ready to use!");
		System.out.println();
		
		Instrument trumpet = brass.makeInstrument("trumpet");
		System.out.println(trumpet.getType() + " ready to use!");
		System.out.println();
		
		Instrument trombone = brass.makeInstrument("trombone");
		System.out.println(trombone.getType() + " ready to use!");
		System.out.println();
		
		Instrument tuba = brass.makeInstrument("tuba");
		System.out.println(tuba.getType() + " ready to use!");
		System.out.println();
	}
}
