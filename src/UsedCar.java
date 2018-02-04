
public class UsedCar extends Car {
	
	private double mileage;
	
	public UsedCar () {
		
	}
	
	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		
		return String.format("%-12s%-12s%-12s$%,-12.2f (Used) %,.1f miles\n", super.getMake(), super.getModel(), super.getYear(), super.getPrice(), mileage);
		// return String.format("%-12s%-12s%-12s$%-12.2f% (Used) %.1f\n", super.getMake(), super.getModel(), super.getYear(), super.getPrice(), mileage);
		// TODO: check that mileage specifier works
	}


	
	
}
