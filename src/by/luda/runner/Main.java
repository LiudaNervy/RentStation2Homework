package by.luda.runner;
import by.luda.entities.Bicycle;
import by.luda.entities.Snowboard;
import by.luda.entities.Sticks;
import by.luda.entities.Category;
import by.luda.entities.Client;
import by.luda.entities.Helmet;
import by.luda.entities.RentStation;
import by.luda.entities.Ski;

public class Main {

	public static void main(String[] args) {
		Bicycle bike1 = new Bicycle(Category.SUMMEREQUIPMENT,"Bike", 56.4, "Cannondale", 0);
		Bicycle bike2 = new Bicycle(Category.SUMMEREQUIPMENT, "Bile", 54.7, "specialized", 0);
		Snowboard snowboard1 = new Snowboard(Category.WINTEREQUIPMENT, "Snowboard", 78.7, "kurlyk", 0);
		Snowboard snowboard2 = new Snowboard(Category.WINTEREQUIPMENT, "Snowboard", 14.9, "kyrlyck1", 0);
		Ski skis1 = new Ski (Category.WINTEREQUIPMENT, "Ski", 78.7, "kurlyk", 0);
		Ski skis2 = new Ski (Category.WINTEREQUIPMENT, "Ski", 78.7, "kurlyk", 0);
		Helmet helmet1 = new Helmet (Category.WINTERACCESSORY, "Helmet", 15.2, "Kar-kar", 0);
		Helmet helmet2 = new Helmet (Category.SUMMERACCESSORY, "Helmet", 13.1, "Kar-karLeto", 0);
		Sticks sticks1 = new Sticks (Category.WINTERACCESSORY, "SticksW", 10.2, "Kar-kar", 0);
		Sticks sticks2  = new Sticks(Category.SUMMERACCESSORY, "SticksS", 9.1, "Kar-karLeto", 0);
		
		
		Client client1 = new Client("Liudochke", 0 );
		Client client2 = new Client("Ilza", 0);
		Client client3 = new Client ("Luda", 0);

		RentStation availableUnits = new RentStation(15);

		availableUnits.addEquipment(bike1, 0);
		availableUnits.addEquipment(bike2, 1);
		availableUnits.addEquipment(snowboard1, 2);
		availableUnits.addEquipment(snowboard2, 3);
		availableUnits.addEquipment(skis1, 4);
		availableUnits.addEquipment(skis2, 5);
		
		
		
		availableUnits.equipmentCatalog();

	}

}
