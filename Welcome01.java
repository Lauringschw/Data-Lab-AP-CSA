import core.data.*; //import the data

public class Welcome01 {
	// main tester
	public static void main(String[] args) {
		String id = "KSEA";
		DataSource ds = DataSource.connect("http://weather.gov/xml/current_obs/" + id + ".xml");
		ds.setCacheTimeout(15 * 60);
		ds.load();
		ds.printUsageString();
		float temp = ds.fetchFloat("temp_f");
		String loc = ds.fetchString("location");
		System.out.println("The temperature at " + loc + " is " + temp + "F");
	}
}


