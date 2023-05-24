package entities;

public class OutSourceEmployee extends Employee{
	
	private Double additionalCharge;
	//overload
	public OutSourceEmployee() {
		super();
	}
	//constructor
	public OutSourceEmployee(String name, Integer hours, Double valuePerHours, Double additionalCharge) {
		super(name, hours, valuePerHours);
		this.additionalCharge = additionalCharge;
	}
	//getters and setters
	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	//overlap
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
}
