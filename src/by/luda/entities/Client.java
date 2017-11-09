package by.luda.entities;

import java.util.Arrays;

public class Client {
	private String name;
	private int passportId;
	private Equipment[] clientRentUnits;

	public Client(int number) {
		clientRentUnits = new Equipment[number];
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

	public void addRentEquipment(Equipment clientRentUnit, int index) {
		clientRentUnits[index] = clientRentUnit;
	}

	public void clientInfoOutput(String name, int passportId) {
		System.out.println(name + " " + passportId + " " + Arrays.toString(clientRentUnits));
	}
}
