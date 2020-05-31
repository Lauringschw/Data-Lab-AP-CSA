public class WeatherStation {
	// instance variables
	private String name;
	private String id;
	private String state;
	private double lat;
	private double lng;

	// weatherStation constructor with parameters
	WeatherStation(String name, String id, String state, double lat, double lng) {
		this.name = name;
		this.id = id;
		this.lat = lat;
		this.lng = lng;
		this.state = state;
	}

	// accessor methods
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getLong() {
		return lng;
	}

	public double getLat() {
		return lat;
	}

	// finds out if the location is at a state
	public boolean isLocatedInState(String st) {
		return this.state.equals(st);
	}

}


