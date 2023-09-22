package program18;
class Plane{
	String brand;
	byte wheels;
	void fly() {
		System.out.println("Plane can fly");
	}
	void takeOff(){
		System.out.println("Plane takeoff");
	}
	void land() {
		System.out.println("Plane landed");
	}
}
class Passenger extends Plane{
	void fly() {
		System.out.println("Passenger planes fly at medium speed");
	}
	void carryPassenger() {
		System.out.println("Passenger planes carry Passenger");
	}
}
class Cargo extends Plane{
	void fly() {
		System.out.println("Cargo planes fly at low speed");
	}
	void carryCargo() {
		System.out.println("Cargo planes carry Cargo");
	}
}
class Fighter extends Plane{
	void fly() {
		System.out.println("Fighter planes fly at high speed");
	}
	void carryArms() {
		System.out.println("Fighter planes carry arms");
	}
}
public class Overriding {

	public static void main(String[] args) {
		Passenger p = new Passenger();
		Cargo c = new Cargo();
		Fighter f = new Fighter();
		p.fly();
		p.carryPassenger();
		p.takeOff();
		p.land();
		c.fly();
		c.carryCargo();
		c.takeOff();
		c.land();
		f.fly();
		f.carryArms();
		f.takeOff();
		f.land();
	}

}
