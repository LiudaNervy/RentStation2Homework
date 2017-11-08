package by.luda.entities;

public class RentUnit {

	private Equipment[] rentUnits;

	public RentUnit(int number) {
		rentUnits = new Equipment[number];
	}

	public void addEquipment(Equipment rentUnit, int index) {
		rentUnits[index] = rentUnit;
	}

	public void rentEquipmentCatalog() {
		for (int i = 0; i < rentUnits.length; i++) {
			if (rentUnits[i] != null) {
				System.out.println("Unit in rent:" +
						rentUnits[i].title + " " + rentUnits[i].category + " " + "price = " + rentUnits[i].price);
			}
		}
	}
}