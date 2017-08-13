package exercise10_1;

import java.util.ArrayList;

public class Waitress1 {
	
	PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
	ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();
	
	DinerMenu1 dinerMenu = new DinerMenu1();
	MenuItem[] lunchItems = dinerMenu.getMenuItems();
	
	// Note: the method look the same e.g. .getMenuItems()
	//		but the return types are different
	
	void printMenu() {
		for(int i = 0; i < breakfastItems.size(); i++) {
			MenuItem menuItem = (MenuItem)breakfastItems.get(i);
			System.out.println(menuItem.getName() + " ");
			System.out.println(menuItem.getPrice() + " ");
			System.out.println(menuItem.getDescription());
		}
		
		for(int i = 0; i < lunchItems.length; i++) {
			MenuItem menuItem = lunchItems[i];
			System.out.println(menuItem.getName() + " ");
			System.out.println(menuItem.getPrice() + " ");
			System.out.println(menuItem.getDescription());
		}
		
		// Note: we implement two different loops, expect more 
		// additional loops if we had other collections.
		// The Arraylist loop uses .size() and .get(), while
		// The Array loop uses .length and subscript [i]
	}
	
	// Other methods below will have the same duplication issue...
	void printBreakfastMenu() {}
	void printLunchMenu() {}
	void printVegetarianMenu() {}
	boolean isItemVegetarian(String name) {return false;}
}
