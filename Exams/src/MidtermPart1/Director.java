package MidtermPart1;

public class Director {
	public static void main(String[] args) {
		BrandNewCar lexus = buildCar(new LexusES300Builder());
		System.out.println(
				"Newly built car: "
				+ lexus.getCarName()
				+ "."
				+ lexus.getCarSpecs());
		System.out.println(lexus.toString());
		
		BrandNewCar lexus2 = buildCar(new LexusES300Builder());
		System.out.println(lexus2.toString());
	}
	
	public static BrandNewCar buildCar(MidSizeCarBuilder midSizeCarBuilder) {
		midSizeCarBuilder.buildBrandNewCar();
		
		midSizeCarBuilder.setCarName();
		
		midSizeCarBuilder.buildChassis();
		midSizeCarBuilder.buildBody();
		
		return midSizeCarBuilder.getBrandNewCar();
	}
}
