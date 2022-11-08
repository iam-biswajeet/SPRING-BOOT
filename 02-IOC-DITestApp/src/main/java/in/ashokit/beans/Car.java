package in.ashokit.beans;

public class Car {
	IEngine eng;
	public Car() {
		System.out.println("Car::constructor");
	}
	public void setEng(IEngine eng) {
		this.eng=eng;
	}
	public void drive() {
		int engStatus=eng.start();
		if(engStatus==1) {
			System.out.println("Journey started");
		}
		else {
			System.out.println("Journey not started");
		}
	}
}
