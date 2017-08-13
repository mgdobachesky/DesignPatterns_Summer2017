package exercise10_1;

import java.util.ArrayList;

public class Waitress2 {
	
	PancakeHouseMenu2 pancakeHouseMenu;
	DinerMenu2 dinerMenu;
	
	// Note that the constructor takes the two menus.
	public Waitress2(PancakeHouseMenu2 pancakeHouseMenu, DinerMenu2 dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	
	public void printMenu() 
	{
		// Print menu now creates the iterator for each menu
		Iterator dinerIterator = dinerMenu.createIterator();
		System.out.println("MENU\n----\nLUNCH");
		printMenu(dinerIterator); // calls the overload method
		
		// Create other menu iterators here and call the same
		// overloaded method below.
		
		Iterator breakfastIterator = pancakeHouseMenu.createIterator();
		System.out.println("----\nBREAKFAST");
		printMenu(breakfastIterator);
	}
	
	void printMenu(Iterator iterator) {
		while(iterator.hasNext()) { // are there more items?
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
		// Note that we are down to just one loop!!!!!!!
	}
}
