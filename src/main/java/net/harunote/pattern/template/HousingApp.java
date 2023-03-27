package net.harunote.pattern.template;


import net.harunote.pattern.template.application.GlassHouse;
import net.harunote.pattern.template.application.HouseTemplate;
import net.harunote.pattern.template.application.WoodenHouse;

public class HousingApp {

	public static void main(String[] args) {
		HouseTemplate houseType = new WoodenHouse();
		//using template method
		houseType.buildHouse();
		System.out.println("************");

		houseType = new GlassHouse();
		houseType.buildHouse();
	}

}
