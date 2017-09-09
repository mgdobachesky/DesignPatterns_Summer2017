package exercise7_1;

import java.text.NumberFormat;

import exercise7_1.Beverage.Size;

public class StarbuzzCoffee {
	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		Beverage beverage = new Expresso(Size.GRANDE);
		System.out.println(beverage.getDescription() + " " + nf.format(beverage.cost()));
		
		Beverage beverage2 = new DarkRoast(Size.TALL);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " " + nf.format(beverage2.cost()));
		
		Beverage beverage3 = new HouseBlend(Size.VENTI);
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " " + nf.format(beverage3.cost()));
	}

}
