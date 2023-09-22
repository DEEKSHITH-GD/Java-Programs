package program19;
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
public class Polymorphism {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v = new Bicycle();
		v.move();
		v = new Bike();
		v.move();
		v= new Car();
		v.move();
	}

}
