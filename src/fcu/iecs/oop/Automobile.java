package fcu.iecs.oop;

public class Automobile extends Vehicle {

	public Automobile(String mark, String model) {
		super(mark, model);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Automobile auto = new Automobile("Toyota","Yaris");
		System.out.println("Mark : "+auto.getMark()); 
	}

}
