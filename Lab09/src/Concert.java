//Zachary Scholz
public class Concert {
String name;
int capacity;
int ticketsPhone;
int ticketsVenue;
double pricePhone;
double priceVenue;
int total;

public Concert() {
	this.name = "";
	this.capacity = 0;
	this.ticketsPhone = 0;
	this.ticketsVenue = 0;
	this.pricePhone = 0;
	this.priceVenue = 0;
	this.total = 0;
}
public Concert(String xName, int xCapacity, double xPricePhone, double xPriceVenue ) {
	this.name = xName;
	this.capacity = xCapacity;
	this.pricePhone = xPricePhone;
	this.priceVenue = xPriceVenue;
}
public void setBandName(String xName) {
	this.name = xName;
}
public void setCapacity(int xCapacity) {
	if(xCapacity < 0) {
		System.out.println("Invalid Capacity amount");
	}
	else {
		this.capacity = xCapacity;
	}
}
public void setTickPhone(int xTicketsPhone){
	if(xTicketsPhone < 0) {
		System.out.println("Invalid number of tickets sold");
	}
	else {
		this.ticketsPhone = xTicketsPhone;
		this.total = total + ticketsPhone;
	}
}
public void setTickVenue(int xTicketsVenue) {
	if(xTicketsVenue < 0) {
		System.out.println("Invalid number of tickets sold");
	}
	else {
		this.ticketsVenue = xTicketsVenue;
		this.total = total + ticketsVenue;
	}
}
public void setPriceAtVenue(double xPriceVenue) {
	if(xPriceVenue < 0) {
		System.out.println("Invalid number of tickets sold");
	}
	else {
		this.priceVenue = xPriceVenue;
	}
}
public void setPriceByPhone(double xPricePhone) {
	if(xPricePhone < 0) {
		System.out.println("Invalid number of tickets sold");
	}
	else {
		this.pricePhone = xPricePhone;
	}
}
public String getBandName() {
	return name;
}
public int getCap() {
	return capacity;
}
public int getNumTicketsSoldByPhone() {
	return ticketsPhone;
}
public int getNumTicketsSoldAtVenue() {
	return ticketsVenue;
}
public double getPricePhone() {
	return pricePhone;
}
public double getPriceVenue() {
	return priceVenue;
}
public int totalNumberOfTicketsSold() {
	return ticketsPhone + ticketsVenue;
}
public int ticketsRemaining() {
	return capacity - totalNumberOfTicketsSold();
}
public void buyTicketsByPhone(int ticketsBought) {
	if(ticketsBought > 0 && ticketsBought <= ticketsRemaining()) {
		ticketsPhone += ticketsBought;
	}
	else {
		System.out.println("The concert is sold out!");
	}
}
public void buyTicketsAtVenue(int ticketsBought) {
	if(ticketsBought > 0 && ticketsBought <= ticketsRemaining()) {
		ticketsVenue += ticketsBought;
	}
	else {
		System.out.println("invalid tickets to buy by phone.");
	}
}
	public double totalSales() {
        return (ticketsVenue * priceVenue) + (ticketsPhone * pricePhone);
    }
	 public String toString() {
	        return "Concert{" +
	               "bandName='" + name + '\'' +
	               ", capacity=" + capacity +
	               ", ticketsSoldByPhone=" + ticketsPhone +
	               ", ticketsSoldAtVenue=" + ticketsVenue +
	               ", priceByPhone=" + pricePhone +
	               ", priceAtVenue=" + priceVenue +
	               '}';
	    }

}



