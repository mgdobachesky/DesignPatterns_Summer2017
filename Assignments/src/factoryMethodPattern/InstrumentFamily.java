package factoryMethodPattern;

// Abstract Creator

public abstract class InstrumentFamily {
	public Instrument makeInstrument(String type) {
		// create instrument to use in factory process
		Instrument instrument;
		
		// define what kind of instrument is to be built
		instrument = createInstrument(type);
		
		// build instrument
		instrument.buildInstrument();
		instrument.tuneInstrument();
		instrument.finishingTouches();
		
		return instrument;
	}
	
	// Factory Method
	// used to define how an instrument is built
	// delegated to sub-class
	protected abstract Instrument createInstrument(String type);
}
