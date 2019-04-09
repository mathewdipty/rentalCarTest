package com.rentalcar.tests.rental_car_project;

public class CarModel {
   

	private String make;
    private String model;
    private String vin;
    private String color;
    private String Notes;
    private float Price;
    private float Discount;
    private float PriceWithDiscount;
    private float yearlyMaintenanceCost;
    private float depreciation;
    private float totalYearlyMain;
    private int weeklyRentalCount;
    private int yearlyCount;
    private float totalProfitWithOutDiscount;
    private float totalProfitWithDiscount;
    
    public CarModel (String newmake,String newmodel,String newvin,String carcolor,String carNotes,float dailyPrice,float dailyDiscount,float caryearlyMaintenanceCost,float cardepreciation,int carweeklyRentalCount,int caryearlyCount ) {
    	make=newmake;
    	model=newmodel;
    	vin=newvin;
    	color=carcolor;
    	Notes=carNotes;
    	Price=dailyPrice;
    	Discount=dailyDiscount;
    	PriceWithDiscount=Price-Discount;
    	yearlyMaintenanceCost=caryearlyMaintenanceCost;
    	depreciation=cardepreciation;
    	totalYearlyMain=yearlyMaintenanceCost+depreciation;
    	weeklyRentalCount=carweeklyRentalCount;
    	yearlyCount=caryearlyCount;
    	totalProfitWithOutDiscount=(Price*yearlyCount)-totalYearlyMain;
    	totalProfitWithDiscount=(PriceWithDiscount*yearlyCount)-totalYearlyMain;
    }
    
    public String getMake() {
    	return make;
    	    }
    public String getColor() {
    	return color;
    	    }
    public String getVin() {
    	return vin;
    }
    public String getNotes() {
    	return Notes;
    }
    public float getPricePerDay() {
    	return Price;
    }
    public float getPriceWithDiscountPerDay() {
    	
    	return PriceWithDiscount;
    }
    public float getTotalMaintenance() {
    	return totalYearlyMain;
    }
    public int getYearlyRentalCount() {
    	return yearlyCount;
    }
    public float getTotalProfitWithOutDiscount() {
    		return totalProfitWithOutDiscount;
    	}
    
    public float getTotalProfitWithDiscount() {
		return totalProfitWithDiscount;
	}
    public void setModel(String model) {
		this.model = model;
	}

	

	public void setPrice(float price) {
		Price = price;
	}


	public void setDiscount(float discount) {
		Discount = discount;
	}

	

	public void setPriceWithDiscount(float priceWithDiscount) {
		PriceWithDiscount = priceWithDiscount;
	}

	

	public void setYearlyMaintenanceCost(float yearlyMaintenanceCost) {
		this.yearlyMaintenanceCost = yearlyMaintenanceCost;
	}

	

	public void setDepreciation(float depreciation) {
		this.depreciation = depreciation;
	}

	

	public void setTotalYearlyMain(float totalYearlyMain) {
		this.totalYearlyMain = totalYearlyMain;
	}

	

	public void setWeeklyRentalCount(int weeklyRentalCount) {
		this.weeklyRentalCount = weeklyRentalCount;
	}

	
	public void setYearlyCount(int yearlyCount) {
		this.yearlyCount = yearlyCount;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setNotes(String notes) {
		Notes = notes;
	}

	public void setTotalProfitWithOutDiscount(float totalProfitWithOutDiscount) {
		this.totalProfitWithOutDiscount = totalProfitWithOutDiscount;
	}

	public void setTotalProfitWithDiscount(float totalProfitWithDiscount) {
		this.totalProfitWithDiscount = totalProfitWithDiscount;
	}
    
}

