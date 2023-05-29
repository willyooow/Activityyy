package IndividualActivity;

public class ToyotaVIOS extends Vehicle {
	
String TireType = "All-Season Tires";
	
	public void Drive() {
		System.out.println("The car is moving");
	}
	
	@Override
	public void stop() {
		super.stop();
	}
}