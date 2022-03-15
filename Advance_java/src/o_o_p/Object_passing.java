package o_o_p;

public class Object_passing {
	public static void main(String[] args) {
		Garage garage = new Garage();
		Car1 car = new Car1("BME");
		garage.park(car);// object passing
	}
}

class Garage {
	void park(Car1 car) { // object is available for passing -- object as agrument
		System.out.println("the car is " + car.name + " park");
	}
}

class Car1 {
	String name;

	Car1(String name) {
		this.name = name;
	}
}
