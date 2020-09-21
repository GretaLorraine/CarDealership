package com.car;


public class Car {

	private String image;
	private String vinNumber;
	private String make;
	private String model;
	private String year;
	private boolean isUsed;
	private String mileage;
	private double price;
	private String color;
	private String battery;
	private String motor;
	private int daysPosted;
	private String description;
	private boolean isSold;
	
	public Car(String image, String vinNumber, boolean isUsed, String make, String model, String year, String mileage, double price, String color, String battery, String motor, String description) {
		this.image = image;
		this.vinNumber = vinNumber;
		this.make = make;
		this.model = model;
		this.year = year;
		this.isUsed = isUsed;
		this.mileage =mileage;
		this.price = price;
		this.color = color;
		this.battery = battery;
		this.motor = motor;
		
		this.description = description;
		this.isSold = false;
	}
	
	public Car() {}
	
		//getters and setters
		//image
		public String getImage() {
			return this.image;
		}
		public void setImage(String image) {
			this.image = image; 
		}
		
		//vin number
		public String getVinNumber() {
			return this.vinNumber;
		}
		public void setVinNumber(String vinNumber) {
			this.vinNumber = vinNumber;
		}
		
		//make
		public String getMake() {
			return this.make;
		}
		public void setMake(String make) {
			this.make = make;
		}
		
		//model
		public String getModel() {
			return this.model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		
		//year
		public String getYear() {
			return this.year;
		}
		public void setYear(String year) {
			this.year = year;
		}
		
		//used
		public boolean getIsUsed() {
			return this.isUsed;
		}
		public void setIsUsed(boolean isUsed) {
			this.isUsed = isUsed;
		}
		
		//mileage
		public String getMileage() {
			return this.mileage;
		}
		public void setMileage(String mileage) {
			this.mileage = mileage;
		}
		
		//price
		public double getPrice() {
			return this.price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
		//color
		public String getColor() {
			return this.color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		
		//battery
		public String getBattery() {
			return this.battery;
		}
		public void setBattery(String battery) {
			this.battery = battery;
		}
		
		//motor
		public String getMotor() {
			return this.motor;
		}
		public void setMotor(String motor) {
			this.motor = motor;
		}
		
		//days posted
		public int getDaysPosted() {
			return this.daysPosted;
		}
		public void setDaysPosted(int daysPosted) {
			this.daysPosted = daysPosted;
		}
		
		//description
		public String getDescription() {
			return this.description;
		}
		public void setDescription(String description) {
			this.description = description;
		}

		//is sold
		public boolean isSold() {
			return isSold;
		}
		public void setSold(boolean isSold) {
			this.isSold = isSold;
		}

		@Override
		public String toString() {
			return "Car [image=" + image + ", vinNumber=" + vinNumber + ", make=" + make + ", model=" + model
					+ ", year=" + year + ", isUsed=" + isUsed + ", mileage=" + mileage + ", price=" + price + ", color="
					+ color + ", battery=" + battery + ", motor=" + motor + ", daysPosted=" + daysPosted
					+ ", description=" + description + ", isSold=" + isSold + "]";
		}
	
		public String toFile() {
			return image + "#" + vinNumber + "#" + isUsed + "#" + make + "#" + model + "#" + year + "#" + mileage+ "#" + price+ "#" + color + "#" + battery + "#" + motor+ "#" + description;
		}

}
