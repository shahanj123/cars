package com.example.cars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CarsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarsApplication.class, args);
	}
	@RestController
	class MyWebserviceController{
		
		@RequestMapping("/Cars")
		public companycars greeting() {
			
			//use arraylist to add multiple stuff
			return new companycars (1000, "Shahan","Jeep","Wrangler", 2016);
			
		}
		
	class companycars{
		private int carID;
		private String name;
		private String model;
		private String make;
		private int year;
		
		
		public int getCarID() {
			return carID;
		}
		public void setCarID(int carID) {
			this.carID = carID;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public String getMake() {
			return make;
		}
		public void setMake(String make) {
			this.make = make;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public companycars(int carID, String name, String model, String make, int year) {
			// TODO Auto-generated constructor stub
		}
		
	}
	}
}
