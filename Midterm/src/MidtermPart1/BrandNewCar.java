package MidtermPart1;
// The Product - this is what will be builded
public class BrandNewCar {

	String carName;
	
	Chassis chassis;
	Body body;
	
	private static BrandNewCar uniqueInstance;
	private BrandNewCar() {}
	public static BrandNewCar getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new BrandNewCar();
		}
		return uniqueInstance;
	}
	
	public String getCarName() {
		return uniqueInstance.carName;
	}
	
	public String getCarSpecs() {
		StringBuffer carSpecs = new StringBuffer();
		carSpecs.append(" Today's car -> ");
		carSpecs.append(" Specification: ");
		carSpecs.append(uniqueInstance.chassis.getPartID() + ", ");
		carSpecs.append(uniqueInstance.body.getPartID() + ", ");
		return carSpecs.toString();
	}
	
}
