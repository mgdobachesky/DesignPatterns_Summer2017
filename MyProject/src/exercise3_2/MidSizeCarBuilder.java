package exercise3_2;
// The Abstract Builder
public abstract class MidSizeCarBuilder {
	BrandNewCar brandNewCar;
	
	public BrandNewCar getBrandNewCar() {
		return brandNewCar;
	}
	
	public void buildBrandNewCar() {
		brandNewCar = new BrandNewCar();
	}
	
	public abstract void setCarName();
	
	public void buildChassis() {
		brandNewCar.chassis = new Chassis();
	}
	
	public void buildBody() {
		brandNewCar.body = new Body();
	}
}
