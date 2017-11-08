package by.luda.entities;

public class Equipment {
	protected Category category;
	protected String title;
	protected double price;
	protected String manufacturer;
	protected int inRent;
	
	public Equipment(Category category, String title, double price, String manufacturer, int inRent) {
		super();
		this.category = category;
		this.title = title;
		this.price = price;
		this.manufacturer = manufacturer;
		this.inRent = inRent;
	}

	
}
