
class car_ {
	
	public String color;
	
	public car_() {};
	
	public car_(String col) {
		this.color = col;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public static void main(String[] args) {
		car_ newCar = new car_("Yellow");
		System.out.println("Car color is: " + newCar.getColor());
		setColorBlue(newCar);
		System.out.println("Car color is: " + newCar.getColor());
	}
	
	public static void setColorBlue(car_ c) {
		c.color = "Blue";
	}
}
