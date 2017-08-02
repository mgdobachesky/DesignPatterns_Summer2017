package exercise3_2;
// The Product - this is what will be builded
public class BrandNewCar {

	String carName;
	
	Chassis chassis;
	Body body;
	
	public String getCarName() {
		return carName;
	}
	
	public String getCarSpecs() {
		StringBuffer carSpecs = new StringBuffer();
		carSpecs.append(" Today's car -> ");
		carSpecs.append(" Specification: ");
		carSpecs.append(this.chassis.getPartID() + ", ");
		carSpecs.append(this.body.getPartID() + ", ");
		return carSpecs.toString();
	}
	
}
