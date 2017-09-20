package MidtermPart2;

public class SalesSimulator {

	public static void main(String[] args) {
		double totalRevenue = 0.0;
		SalesMarketForecast marketForecast = new SalesMarketForecast();
		
		marketForecast.setSalesTax(new AlabamaSalesTax());
		totalRevenue += marketForecast.calculateStateRevenue();
		
		marketForecast.setSalesTax(new AlaskaSalesTax());
		totalRevenue += marketForecast.calculateStateRevenue();
		
		marketForecast.setSalesTax(new ArizonaSalesTax());
		totalRevenue += marketForecast.calculateStateRevenue();
		
		marketForecast.setSalesTax(new ArkansasSalesTax());
		totalRevenue += marketForecast.calculateStateRevenue();
		
		marketForecast.setSalesTax(new CaliforniaSalesTax());
		totalRevenue += marketForecast.calculateStateRevenue();
		
		marketForecast.setSalesTax(new ColoradoSalesTax());
		totalRevenue += marketForecast.calculateStateRevenue();
		
		marketForecast.setSalesTax(new ConnecticutSalesTax());
		totalRevenue += marketForecast.calculateStateRevenue();
		
		System.out.println();
		System.out.println("Total revenue for first month: $" + totalRevenue);
	}

}
