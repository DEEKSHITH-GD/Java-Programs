package program20;

class Vehicle{
	void move() {
		System.out.println("Vehicle move with speed");
	}
}
class Bicycle extends Vehicle{
	void move() {
		System.out.println("bicycle move with low speed");
	}
}
class Bike extends Vehicle{
	void move() {
		System.out.println("Bike move with medium speed");
	}
}
class Car extends Vehicle{
	void move() {
		System.out.println("Car move with high speed");
	}
}
class Road{
	public void allow(Vehicle v) {
		v.move();
	}
}
public class Polymorphismflexibility {

	public static void main(String[] args) {
		Road r = new Road();
		Bicycle b = new Bicycle();
		Bike b1 = new Bike();
		Car c = new Car();
		r.allow(b);
		r.allow(b1);
		r.allow(c);
	}

}
