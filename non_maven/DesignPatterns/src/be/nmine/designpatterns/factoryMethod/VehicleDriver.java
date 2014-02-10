package be.nmine.designpatterns.factoryMethod;

abstract class VehicleDriver {
	public abstract Vehicle getVehicle();

	public void driveVehicle() {
		getVehicle().drive();
	}

	public void cleanVehicle() {
		getVehicle().clean();
	}
}

class CarDriver extends VehicleDriver {
	@Override
	public Vehicle getVehicle() {
		return new Car();
	}
}

class BusDriver extends VehicleDriver {
	@Override
	public Vehicle getVehicle() {
		return new Bus();
	}
}
