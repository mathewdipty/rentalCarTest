package com.rentalcar.tests.rental_car_project;

import java.util.ArrayList;

import java.util.HashSet;


public class CarInformation {
 
	
	/*Prints the List of cars that match the make and color */
	
	public static void printListOfCarIfAvailable(ArrayList<CarModel> carList,String carModel,String carColor) {
		
	    int count=0;
	   	for (CarModel currentCar:carList) {
		if (currentCar.getMake()==carModel && currentCar.getColor()==carColor) {
				count++;
				System.out.println(currentCar.getMake().toString()+ ", "+currentCar.getVin().toString()+ ", " +currentCar.getNotes().toString());
					}
		
		}
	   	if (count==0) {
			System.out.println("There are no " +carColor+ " "+carModel + "'s available currently");
		}
	}
	/*Returns the list of cars with lowest rate with no discount*/
	
	public static HashSet<CarModel> getLowestRatePerDayNoDiscount(ArrayList<CarModel> carlist) {
		HashSet<CarModel> rateNoDiscount=new HashSet<CarModel>();
		float lowestPricePerDay=carlist.get(0).getPricePerDay();
		for(CarModel currentCar:carlist) {
			lowestPricePerDay=Math.min(currentCar.getPricePerDay(),lowestPricePerDay);
			}
		for (CarModel currentCar:carlist) {
			if(lowestPricePerDay==currentCar.getPricePerDay()) {
				rateNoDiscount.add(currentCar);
			}
		}
		return rateNoDiscount;
	}
	/*Returns the list of cars with lowest rate with discount*/
	public static HashSet<CarModel> getLowestRatePerDayWithDiscount(ArrayList<CarModel> carlist) {
		HashSet<CarModel> rateWithDiscount=new HashSet<CarModel>();
		float lowestPricePerDay=carlist.get(0).getPriceWithDiscountPerDay();
		for(CarModel currentCar:carlist) {
			lowestPricePerDay=Math.min(currentCar.getPriceWithDiscountPerDay(),lowestPricePerDay);
			}
		for (CarModel currentCar:carlist) {
			if(lowestPricePerDay==currentCar.getPriceWithDiscountPerDay()) {
				rateWithDiscount.add(currentCar);
			}
		}
		return rateWithDiscount;
	}
	/*Returns the list of cars with maximum profit*/
	public static HashSet<CarModel> getHighestProfitPerYear(ArrayList<CarModel> carlist) {
		HashSet<CarModel> highestProfitPerYear=new HashSet<CarModel>();
		float highestYearlyProfitWithDiscount=carlist.get(0).getTotalProfitWithDiscount();
		float highestYearlyProfitWithoutDiscount=carlist.get(0).getTotalProfitWithOutDiscount();
		float highestProfit=0.0F;
		for(CarModel currentCar:carlist) {
			highestYearlyProfitWithDiscount=Math.max(currentCar.getTotalProfitWithDiscount(), highestYearlyProfitWithDiscount);
			highestYearlyProfitWithoutDiscount=Math.max(currentCar.getTotalProfitWithOutDiscount(), highestYearlyProfitWithDiscount);
			highestProfit=Math.max(highestYearlyProfitWithDiscount,highestYearlyProfitWithoutDiscount);
			}
		for (CarModel currentCar:carlist) {
			if(highestProfit==currentCar.getTotalProfitWithDiscount()||highestProfit==currentCar.getTotalProfitWithOutDiscount()) {
				highestProfitPerYear.add(currentCar);
			}
		}
		return highestProfitPerYear;
	}
	

	
	
		public static void main (String args[]) {
			ArrayList<CarModel> carList=new ArrayList<CarModel>();
			
			carList.add(new CarModel("Audi", "A7", "09AGHY64352JITEG98K", "Black", "Scratches on the front side of the car", 140, 15, 2190.76f,  2256.43f, 4, 221));
				carList.add(new CarModel("Tesla", "6", "09AGHY64352JITEG98K", "Blue", "Scratches on the tesla side of the car", 160, 10, 200.00f,  300.43f, 50, 600));
				carList.add(new CarModel("Mercedes", "Sclass", "09AGHY643556ITEG98K", "White", "Scratches on the merceded side of the car", 300, 15, 1000.76f,  1000.43f, 45, 765));
				carList.add(new CarModel("BMW", "MSeries", "09AGHY64352JITEG944K", "Purple", "Scratches on the bmw side of the car", 140, 15, 1500.76f,  1500.43f, 6, 700));
				/*printListOfCarIfAvailable(carList,"Tesla","Blue");*/
				HashSet<CarModel> rateNoDiscount1=new HashSet<CarModel>();
				rateNoDiscount1=getLowestRatePerDayNoDiscount(carList);
				
				for (CarModel car:rateNoDiscount1) {
				System.out.println(car.getColor()+ ", " +car.getMake()+", "+"," +car.getVin()+ ", " + car.getPricePerDay());
				}
				HashSet<CarModel> rateWithDiscount1=new HashSet<CarModel>();
				rateWithDiscount1=getLowestRatePerDayNoDiscount(carList);
				
				for (CarModel car:rateWithDiscount1) {
				System.out.println(car.getColor()+ ", " +car.getMake()+", "+"," +car.getVin()+ ", " + car.getPriceWithDiscountPerDay());
				}
				HashSet<CarModel> highestProfitPerYear1=new HashSet<CarModel>();
				highestProfitPerYear1=getLowestRatePerDayNoDiscount(carList);
				
				for (CarModel car:highestProfitPerYear1) {
				System.out.println(car.getColor()+ ", " +car.getMake()+", "+"," +car.getVin());
				}
		}
	
}
