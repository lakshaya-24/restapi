package com.example.demo.carModel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Car")
public class CarModel {
	
	@Id
	 private int pid;
	private String pname;
	private String pcountry;
	private String brandname;
	private String plateNumber;
	private String fueltype;
	private String milage;
	private String speedperKm;
	private String ownername;
	private String ownernumber;
	private String ownercity;
	public int getPid(int id) {
		return pid;
	}
	public void setPid(int pid) {
		
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPcountry() {
		return pcountry;
	}
	public void setPcountry(String pcountry) {
		this.pcountry = pcountry;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public String getPlateNumber() {
		return plateNumber;
	}
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	public String getFueltype() {
		return fueltype;
	}
	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	public String getMilage() {
		return milage;
	}
	public void setMilage(String milage) {
		this.milage = milage;
	}
	public String getSpeedperKm() {
		return speedperKm;
	}
	public void setSpeedperKm(String speedperKm) {
		this.speedperKm = speedperKm;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public String getOwnernumber() {
		return ownernumber;
	}
	public void setOwnernumber(String ownernumber) {
		this.ownernumber = ownernumber;
	}
	public String getOwnercity() {
		return ownercity;
	}
	public void setOwnercity(String ownercity) {
		this.ownercity = ownercity;
	}
	public CarModel(int pid, String pname, String pcountry, String brandname, String plateNumber, String fueltype,
			String milage, String speedperKm, String ownername, String ownernumber, String ownercity) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcountry = pcountry;
		this.brandname = brandname;
		this.plateNumber = plateNumber;
		this.fueltype = fueltype;
		this.milage = milage;
		this.speedperKm = speedperKm;
		this.ownername = ownername;
		this.ownernumber = ownernumber;
		this.ownercity = ownercity;
	}
	public CarModel() {
		
	}
	

}
