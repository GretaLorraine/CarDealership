package com.car.repository;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.car.Car;

public class Repository {

	private static List<Car> carList = new ArrayList<Car>();

	
	public static List<Car> getCarList() {
		return carList;
	}
	public static void setCarList(List<Car> list) {
		carList = list;
	}
	
	public static void addToDataFile(Car car) {
		String fileName = "C:\\Users\\Genevieve\\eclipse-workspace\\car-dealership\\NeverlandAutomotive\\WebContent\\WEB-INF\\Vehicles.txt";
		
		File file = new File(fileName); 
		
		try {
			if(!file.exists()){
		    	   file.createNewFile();
		    }
			
			FileWriter fw = new FileWriter(file,true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(car.toFile());
			bw.write("\r\n");//add carriage return so next entry goes on a new line
	    	
	    	//Closing BufferedWriter Stream
	    	bw.close();
	    	
	    	//System.out.println("Data successfully appended at the end of file");
			
		}
		catch (IOException ioe) {
	         System.out.println("File exception occurred:");
	    	 ioe.printStackTrace();
	    }
	}
	
	public static ArrayList<Car> readDataFile() throws FileNotFoundException {
		String fileName = "C:\\Users\\Genevieve\\eclipse-workspace\\car-dealership\\NeverlandAutomotive\\WebContent\\WEB-INF\\Vehicles.txt"; 

		ArrayList<Car> vehFromDataFile = new ArrayList<Car>();
		
//		try {
			Scanner scanner = new Scanner(new File(fileName));
			
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] parsedLine = line.split("#");
				
				String image = parsedLine[0];
				String vinNumber = parsedLine[1];
				Boolean isUsed = Boolean.parseBoolean(parsedLine[2]);
				String make = parsedLine[3];
				String model = parsedLine[4];
				String year = parsedLine[5];
				String mileage = parsedLine[6];
				double price = Double.parseDouble(parsedLine[7]);
				String color = parsedLine[8];
				String battery = parsedLine[9];
				String motor = parsedLine[10];
				String description = parsedLine[11];
//				String dateSold = parsedLine[12];
//				String priceSticker = parsedLine[13];
//				String priceSold = parsedLine[14];
//				String dateAdded = parsedLine[15];
//				String isOver120 = parsedLine[16];
				
				Car Car = new Car(image, vinNumber, isUsed, make, model, year, mileage, price, color, battery, motor, description); 
				//		isSold, isOver120, dateAdded, dateSold, priceSticker, priceSold, buyer);
				vehFromDataFile.add(Car);
			}
			scanner.close();
//		}catch (FileNotFoundException e) {
//			System.out.println("Error reading from file.");
//		}
		return vehFromDataFile;
	}//end readDataFile
}
