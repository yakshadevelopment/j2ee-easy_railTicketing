package easy_railTicketing;

import java.util.List;

public class Ticket {
	private Integer ticketNumber;
	private String trainName;
	private String jdate;
	private String fromLocation;
	private String toLocation;
	private String totalAmount;
	private String trainClass;
	List<Passenger> passengerList;
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Ticket(Integer ticketNumber, String trainName, String jdate, String fromLocation, String toLocation,
			String totalAmount, String trainClass, List<Passenger> passengerList) {
		super();
		this.ticketNumber = ticketNumber;
		this.trainName = trainName;
		this.jdate = jdate;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.totalAmount = totalAmount;
		this.trainClass = trainClass;
		this.passengerList = passengerList;
	}

	public Integer getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(Integer ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getJdate() {
		return jdate;
	}
	public void setJdate(String jdate) {
		this.jdate = jdate;
	}
	public String getFromLocation() {
		return fromLocation;
	}
	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}
	public String getToLocation() {
		return toLocation;
	}
	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public List<Passenger> getPassengerList() {
		return passengerList;
	}
	public void setPassengerList(List<Passenger> passengerList) {
		this.passengerList = passengerList;
	}

	public String getTrainClass() {
		return trainClass;
	}

	public void setTrainClass(String trainClass) {
		this.trainClass = trainClass;
	}


}
