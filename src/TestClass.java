public class TestClass {

	public static void main(String[] args) {
		
		Bouquet b = new Bouquet(1,2,3);
		System.out.println("Total price of selected bouquet is " + b.BouquetPrice(2, 3, 4));
		
		PowerConsumption pc = new PowerConsumption(1, 2, 3);
		System.out.println("Current Load in Home is " + pc.CurrentLoad(1, 2, 3));
		
		System.out.println("End of Test Class");
	}
	
}