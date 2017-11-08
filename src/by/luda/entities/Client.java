package by.luda.entities;

import java.util.Arrays;

public class Client {
	private String name;
	private int passportId;
	private Equipment[] rentUnits;

	public void RentUnit(int number) {
		rentUnits = new Equipment[2];
	}

	public Client(String name, int passportId) {
		super();
		this.name = name;
		this.passportId = passportId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPassportId() {
		return passportId;
	}

	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}

	public void addRentEquipment(Equipment rentUnit, int index) {
		rentUnits[index] = rentUnit;
	}

	public void clientInfoOutput(String name, int passportId, Equipment[] rentUnits) {
		System.out.println(name + " " + passportId + " " + Arrays.toString(rentUnits));
	}
}
