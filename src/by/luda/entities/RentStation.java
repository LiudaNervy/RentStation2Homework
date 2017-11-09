package by.luda.entities;

public class RentStation {

private Equipment[] availableUnits;
	
	public RentStation(int number) {
		availableUnits = new Equipment[number];
	}

public void addEquipment (Equipment availableUnit, int index) {
availableUnits[index] = availableUnit;


}

	public void equipmentCatalog () {
		for (int i = 0; i< availableUnits.length; i++) {
			if (availableUnits[i] != null) {
				System.out.println("Unit available for rent: " + availableUnits[i].title + " " + availableUnits[i].category + " " + availableUnits[i].price);
			}
		}
	}
}
