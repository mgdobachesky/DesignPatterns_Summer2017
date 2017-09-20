package MidtermPart1;
// The Abstract Builder
public abstract class MidSizeCarBuilder {
	BrandNewCar brandNewCar;
	
	public BrandNewCar getBrandNewCar() {
		return brandNewCar;
	}
	
	public void buildBrandNewCar() {
		brandNewCar = BrandNewCar.getInstance();
	}
	
	public abstract void setCarName();
	
	public void buildChassis() {
		brandNewCar.chassis = new Chassis();
	}
	
	public void buildBody() {
		brandNewCar.body = new Body();
	}
}
