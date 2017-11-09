package by.luda.runner;
import by.luda.entities.Bicycle;
import by.luda.entities.Snowboard;
import by.luda.entities.Sticks;
import by.luda.entities.Category;
import by.luda.entities.Client;
import by.luda.entities.Equipment;
import by.luda.entities.Helmet;
import by.luda.entities.RentStation;
import by.luda.entities.RentUnit;
import by.luda.entities.Ski;

public class Main {

	public static void main(String[] args) {
		Bicycle bike1 = new Bicycle(Category.SUMMEREQUIPMENT,"Bike1", 56.4, "Cannondale", "Available for rent");
		Bicycle bike2 = new Bicycle(Category.SUMMEREQUIPMENT, "Bike2", 54.7, "specialized", "Available for rent");
		Snowboard snowboard1 = new Snowboard(Category.WINTEREQUIPMENT, "Snowboard1", 78.7, "kurlyk", "Available for rent");
		Snowboard snowboard2 = new Snowboard(Category.WINTEREQUIPMENT, "Snowboard2", 14.9, "kyrlyck1", "Available for rent");
		Ski skis1 = new Ski (Category.WINTEREQUIPMENT, "Ski1", 78.7, "kurlyk", "Available for rent");
		Ski skis2 = new Ski (Category.WINTEREQUIPMENT, "Ski2", 78.7, "kurlyk", "Available for rent");
		Helmet helmet1 = new Helmet (Category.WINTERACCESSORY, "Helmet1", 15.2, "Kar-kar", "Available for rent");
		Helmet helmet2 = new Helmet (Category.SUMMERACCESSORY, "Helmet2", 13.1, "Kar-karLeto", "Available for rent");
		Sticks sticks1 = new Sticks (Category.WINTERACCESSORY, "SticksW", 10.2, "Kar-kar", "Available for rent");
		Sticks sticks2  = new Sticks(Category.SUMMERACCESSORY, "SticksS", 9.1, "Kar-karLeto", "Available for rent");
		
		
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
		
		
		RentUnit rentUnits = new RentUnit (15);
		rentUnits.addEquipment(bike1, 0);
		rentUnits.addEquipment(bike2, 1);
		rentUnits.addEquipment(snowboard1, 2);
		rentUnits.addEquipment(snowboard2, 3);
		rentUnits.rentEquipmentCatalog();
		
		Client clientRentUnits = new Client(3);
		clientRentUnits.addRentEquipment(bike1, 0);
		clientRentUnits.addRentEquipment(bike2, 1);
		clientRentUnits.clientInfoOutput("Luda", 374);
		
		
	

	}

}
