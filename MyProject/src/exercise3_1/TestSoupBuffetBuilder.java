package exercise3_1;

public class TestSoupBuffetBuilder {
	// The Client
	public static void main(String[] args) {
		SoupBuffet bostonSoupBuffet = CreateSoupBuffet(new BostonSoupBuffetBuilder());
		System.out.println("At the " + bostonSoupBuffet.getSoupBuffetName() + bostonSoupBuffet.getTodaysSoups());
		
		SoupBuffet honoluluSoupBuffet = CreateSoupBuffet(new HonoluluSoupBuffetBuilder());
		System.out.println("At the " + honoluluSoupBuffet.getSoupBuffetName() + honoluluSoupBuffet.getTodaysSoups());
	}

	// The Director
	public static SoupBuffet CreateSoupBuffet(SoupBuffetBuilder soupBuffetBuilder) {
		soupBuffetBuilder.buildSoupBuffet();
		
		soupBuffetBuilder.setSoupBuffetName();
		
		soupBuffetBuilder.buildChickenSoup();
		soupBuffetBuilder.buildClamChowder();
		soupBuffetBuilder.buildFishChowder();
		soupBuffetBuilder.buildMinnestrone();
		soupBuffetBuilder.buildPastafazul();
		soupBuffetBuilder.buildTofuSoup();
		soupBuffetBuilder.buildVegetableSoup();
		
		return soupBuffetBuilder.getSoupBuffet();
	}
}
