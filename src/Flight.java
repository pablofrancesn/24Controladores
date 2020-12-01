public class Flight {
	private int    idFlight;
	private String destiny;
	private double price;
	
	public Flight() {
	}
	
	public Flight(int idFlight, String destiny, double price) {
		this.idFlight = idFlight;
		this.destiny  = destiny;
		this.price    = price;
	}
	
	public int getIdFlight() {
		return idFlight;
	}
	
	public void setIdFlight(int idFlight) {
		this.idFlight = idFlight;
	}
	
	public String getDestiny() {
		return destiny;
	}
	
	public void setDestiny(String destiny) {
		this.destiny = destiny;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Vuelo {" + "Nº Vuelo: " + idFlight + ", destino: '" + destiny + '\'' + ", precio: " + price + '}';
	}
}
