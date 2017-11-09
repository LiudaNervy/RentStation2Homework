package by.luda.entities;

public class Equipment {
	protected Category category;
	protected String title;
	protected double price;
	protected String manufacturer;
	protected String availability;
	
	public Equipment(Category category, String title, double price, String manufacturer, String availability) {
		super();
		this.category = category;
		this.title = title;
		this.price = price;
		this.manufacturer = manufacturer;
		this.availability = availability;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	
}
