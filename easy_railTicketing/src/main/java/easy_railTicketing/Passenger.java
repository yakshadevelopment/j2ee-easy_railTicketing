package easy_railTicketing;

public class Passenger {
	private String passengerName;
	private Integer age;
	private Double fare;
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getFare() {
		return fare;
	}
	public void setFare(Double fare) {
		this.fare = fare;
	}
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Passenger(String passengerName, Integer age, Double fare) {
		super();
		this.passengerName = passengerName;
		this.age = age;
		this.fare = fare;
	}
	


}
