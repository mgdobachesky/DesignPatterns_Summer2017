package exercise3_1;

// Abstract Builder

public abstract class SoupBuffetBuilder {
	SoupBuffet soupBuffet;
	
	public SoupBuffet getSoupBuffet() {return soupBuffet;}
	
	public void buildSoupBuffet() {soupBuffet = new SoupBuffet();}
	
	public abstract void setSoupBuffetName();
	
	public void buildChickenSoup() {soupBuffet.chickenSoup = new ChickenSoup();}
	public void buildClamChowder() {soupBuffet.clamChowder = new ClamChowder();}
	public void buildFishChowder() {soupBuffet.fishChowder = new FishChowder();}
	public void buildMinnestrone() {soupBuffet.minnestrone = new Minnestrone();}
	public void buildPastafazul() {soupBuffet.pastafazul = new Pastafazul();}
	public void buildTofuSoup() {soupBuffet.tofuSoup = new TofuSoup();}
	public void buildVegetableSoup() {soupBuffet.vegetableSoup = new VegetableSoup();}
}
