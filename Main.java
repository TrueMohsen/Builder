package Builder;

public class Main {

	public static void main(String[] args) {
		
		Director director = new Director();
		CarBuilder carBuilder = new CarBuilder();
		director.constructSportsCar( carBuilder);
		
		Car car = carBuilder.getResult();
		 System.out.println("Car built:\n" + car.getType());
		 
		 CarManualBuilder manualBuilder = new CarManualBuilder();
		 
		 director.constructSportsCar(manualBuilder);
		 Manual carManual = manualBuilder.getResult();
		  System.out.println("\nCar manual built:\n" + carManual.print());

	}

}
