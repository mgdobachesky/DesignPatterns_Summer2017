package exercise3_2;

public class Director {
	public static void main(String[] args) {
		BrandNewCar lexus = buildCar(new LexusES300Builder());
		System.out.println(
				"Newly built car: "
				+ lexus.getCarName()
				+ "."
				+ lexus.getCarSpecs());
	}
	
	public static BrandNewCar buildCar(MidSizeCarBuilder midSizeCarBuilder) {
		midSizeCarBuilder.buildBrandNewCar();
		
		midSizeCarBuilder.setCarName();
		
		midSizeCarBuilder.buildChassis();
		midSizeCarBuilder.buildBody();
		
		return midSizeCarBuilder.getBrandNewCar();
	}
}
