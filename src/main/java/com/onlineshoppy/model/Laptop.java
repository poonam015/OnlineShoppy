package com.onlineshoppy.model;

public class Laptop {

	private int LaptopId;
	private String LaptopName;
	private String LaptopProcessor;
	private int LaptopPrice;
	public Laptop(int laptopId, String laptopName, String laptopProcessor, int laptopPrice) {
		super();
		this.LaptopId = laptopId;
		this.LaptopName = laptopName;
		this.LaptopProcessor = laptopProcessor;
		this.LaptopPrice = laptopPrice;
	}
	public int getLaptopId() {
		return LaptopId;
	}
	public void setLaptopId(int laptopId) {
		this.LaptopId = laptopId;
	}
	public String getLaptopName() {
		return LaptopName;
	}
	public void setLaptopName(String laptopName) {
		this.LaptopName = laptopName;
	}
	public String getLaptopProcessor() {
		return LaptopProcessor;
	}
	public void setLaptopProcessor(String laptopProcessor) {
		this.LaptopProcessor = laptopProcessor;
	}
	public int getLaptopPrice() {
		return LaptopPrice;
	}
	public void setLaptopPrice(int laptopPrice) {
		this.LaptopPrice = laptopPrice;
	}
	@Override
	public String toString() {
		return "Laptop [LaptopId=" + LaptopId + ", LaptopName=" + LaptopName + ", LaptopProcessor=" + LaptopProcessor
				+ ", LaptopPrice=" + LaptopPrice + "]";
	}
	
	
}
