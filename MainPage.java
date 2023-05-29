package IndividualActivity;

public class MainPage {

	public static void main(String[] args) {
    
		ToyotaVIOS Car = new ToyotaVIOS();	
		Car.SPEED = 180;
		Car.COLOR = "RED";
		Car.PRICE = 946000;
		System.out.println("*******************");
		System.out.println("TOYOTA VIOS");
		System.out.println("Speed: " + Car.SPEED + " km/h");
		System.out.println("Color: " + Car.COLOR);
		System.out.println("Price: " + Car.PRICE);
		System.out.println("Tire Type: " + Car.TireType);		
		Car.Drive();
		Car.stop();
		System.out.println("*******************");
		System.out.println(" ");
				
		U2SpyPlane Plane = new U2SpyPlane();
		Plane.SPEED = 460;
		Plane.COLOR = "RED";
		Plane.PRICE = 112;
		System.out.println("*******************");
		System.out.println("U-2 SPY PLANE");
		System.out.println("Speed: " + Plane.SPEED + " mph");
		System.out.println("Color: " + Plane.COLOR);
		System.out.println("Price: " + Plane.PRICE + " " + "million");
		System.out.println("Wing Span: " + Plane.Wingspan);	
		Plane.Fly();
		Plane.stop();	
		System.out.println("*******************");
		System.out.println(" ");
								
		FandangoYacht Boat = new FandangoYacht();
		Boat.SPEED = 34;
		Boat.COLOR = "BLUE";
		Boat.PRICE = 2;
		System.out.println("*******************");		
		System.out.println("FANDANGO YACHT");
		System.out.println("Speed: " + Boat.SPEED + " mph");
		System.out.println("Color: " + Boat.COLOR);
		System.out.println("Price: " + Boat.PRICE + " " + "million");
		System.out.println("Main Sail Color:" + Boat.MainSailColor);
		Boat.Float();
		Boat.stop();
		System.out.println("*******************");				
	}
}