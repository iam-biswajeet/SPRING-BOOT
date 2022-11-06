package in.ashokit.beans;

public class Car /* extends Engine */{
	public void drive() {
		//Composition
		Engine eng=new Engine();
		int engStatus=eng.start();
		/*
		 * Inheritance int engStatus=start();
		 */
		if(engStatus==1) {
			System.out.println("Journey Is Started..!!");
		}
		else {
			System.out.println("Engine is Not started");
		}
	}

}
