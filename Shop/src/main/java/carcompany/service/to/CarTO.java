package carcompany.service.to;

import carcompany.enums.BrandEnum;

public class CarTO {
	private int id;
	private BrandEnum brand;
	private int capacity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public BrandEnum getBrand() {
		return brand;
	}
	public void setBrand(BrandEnum brand) {
		this.brand = brand;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public CarTO(int id, BrandEnum brand, int capacity) {
		super();
		this.id = id;
		this.brand = brand;
		this.capacity = capacity;
	}
}
