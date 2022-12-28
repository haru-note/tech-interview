package com.libqa.pattern.template;


import com.libqa.pattern.template.application.GlassHouse;
import com.libqa.pattern.template.application.HouseTemplate;
import com.libqa.pattern.template.application.WoodenHouse;

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
