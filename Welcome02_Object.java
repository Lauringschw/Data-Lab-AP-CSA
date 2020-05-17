import core.data.*; //import data

public class Welcome02_Object {
	// main tester
	public static void main(String[] args) {
		String id1 = "KATL";
		DataSource ds1 = DataSource.connect("http://weather.gov/xml/current_obs/" + id1 + ".xml");// object 1
		ds1.setCacheTimeout(15 * 60);
		ds1.load();
		ds1.printUsageString();

		Observation ob1 = ds1.fetch("Observation", "weather", "temp_f", "wind_degrees"); // object 1 fetch data
		System.out.println(id1 + ": " + ob1);

		String id2 = "KSAV";
		DataSource ds2 = DataSource.connect("http://weather.gov/xml/current_obs/" + id2 + ".xml");// object 2
		ds2.setCacheTimeout(15 * 60);
		ds2.load();

		Observation ob2 = ds2.fetch("Observation", "weather", "temp_f", "wind_degrees");// object 2 fetch data
		System.out.println(id2 + ": " + ob2);

		String id3 = "KSEA";
		DataSource ds3 = DataSource.connect("http://weather.gov/xml/current_obs/" + id3 + ".xml"); // object 3
		ds3.setCacheTimeout(15 * 60);
		ds3.load();

		Observation ob3 = ds3.fetch("Observation", "weather", "temp_f", "wind_degrees"); // object 3 fetch data
		System.out.println(id3 + ": " + ob3);

		if (ob1.colderThan(ob2) && ob1.colderThan(ob3)) { // if colder than object and colder than object 3
			System.out.println("Colder at " + id1); // print this
		} else {
			if (ob2.colderThan(ob3)) { // if object 2 is colder than 3
				System.out.println("Colder at " + id2); // print out this
			} else {
				System.out.println("Colder at " + id3); // print out this otherwise
			}
		}
	}
}

class Observation {
	String description;
	float temp; // fahrenheit
	int windDir; // degrees

	// Constructor with parameteres
	Observation(String description, float temp, int windDir) {
		this.description = description;
		this.temp = temp;
		this.windDir = windDir;
	}

	public boolean colderThan(Observation that) { // what's colder
		return this.temp < that.temp;
	}

	// to string
	public String toString() {
		return (temp + " degrees; " + description + " (wind: " + windDir + " degrees)");
	}
}
