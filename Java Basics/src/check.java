class car {
	
	private String model;
	private int horsepower;
	
	// Constructor
	public car (String m, int hp) {
		this.model = m;
		this.horsepower = hp;
	}
	
	// method shows the horsepower of the car
	public void showDetails() {
		System.out.println("Car horsepower is: " + this.horsepower);
	}
}


class check {
	public static void main(String[] args) {
		
		// creating the car object with details
		car newCar = new car("Ford", 1000);
		
		newCar.showDetails();
	}
}