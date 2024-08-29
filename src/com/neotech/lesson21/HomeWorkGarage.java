package com.neotech.lesson21;

public class HomeWorkGarage {

	public static void main(String[] args) {
	
		
		FamilyCar family = new FamilyCar();
		
		family.brand = "Tesla";
		family.model = "Model X";
		family.color = "Black";
		family.speed = 3.8;
		family.range = 326;
		
		family.displayInfo();
		family.familyCar();
		family.fast();
		
		System.out.println("----------------");
		
		LuxSportsCar sport = new LuxSportsCar();
		
		sport.brand = "Tesla";
		sport.model = "Roadster";
		sport.color = "Red";
		sport.speed = 1.9;
		sport.range = 620;
		
	//	sport.familyCar(); sport is not family car
		sport.displayInfo();
		sport.sport();
		sport.fast();
				
		System.out.println("------------------");
		
		
		LuxuryCar lux = new LuxuryCar();
		
		lux.brand = "Bugatti";
		lux.model = "Veyron";
		lux.color = "Red and Black";
		lux.speed = 2.5;
		
		lux.displayInfo();
		lux.fast();
		lux.door();

	}

}
