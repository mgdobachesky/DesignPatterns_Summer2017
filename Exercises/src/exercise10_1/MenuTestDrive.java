package exercise10_1;

public class MenuTestDrive {

	public static void main(String[] args) {
		DinerMenu2 dinerMenu = new DinerMenu2();
		PancakeHouseMenu2 breakfastMenu = new PancakeHouseMenu2();
		
		// Pass the menus to the waitress
		Waitress2 alice = new Waitress2(breakfastMenu, dinerMenu);
		
		alice.printMenu();
	}

}
