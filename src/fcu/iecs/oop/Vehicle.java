package fcu.iecs.oop;

public class Vehicle {

	private String mark = "Toyota";
	
	private String model;
	
	public Vehicle(String mark, String model) {
		super();
		this.mark = mark;
		this.model = model;
	}

	public String getMark() {
		return mark;
	}
	
	public void setMark(String mark) {
		this.mark = mark;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
}
