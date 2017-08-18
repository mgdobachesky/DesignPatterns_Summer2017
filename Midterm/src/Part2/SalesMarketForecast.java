package Part2;

public class SalesMarketForecast {
	private final double price = 80.0;
	private final int amountSold = 10_000;
	private double salesTaxAmount;
	private double statePrice;
	private double stateRevenue;
	private String stateName;
	private SalesTax salesTax;
	
	public SalesMarketForecast() {
		salesTaxAmount = 0;
	}
	
	public void setSalesTax(SalesTax salesTax) {
		this.salesTax = salesTax;
		salesTaxAmount = this.salesTax.setSalesTax();
		stateName = this.salesTax.setStateName();
	}
	
	public double calculateStateRevenue() {
		statePrice = price + (price*(salesTaxAmount/100));
		stateRevenue = statePrice * amountSold;
		System.out.println(stateName + " generated $" + Double.toString(stateRevenue) + " in revenue");
		return stateRevenue;
	}
}
