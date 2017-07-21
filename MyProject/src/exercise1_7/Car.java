package exercise1_7;

public class Car {
	
	String color;
	Tire firestone = new Tire();

	public String getColor()
	{
		return color;
	}
	public void setColor(String newColor)
	{
		color = newColor;
	}
	
	public static void main(String[] args) {
		Car nsx = new Car();
		nsx.setColor("pink");
		nsx.firestone.setDiameter(17);
		System.out.println( "Color = " + nsx.getColor() );
		System.out.println( "Diameter = " + nsx.firestone.getDiameter() );
	}
	
}
