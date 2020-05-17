/**
 * Class that represents a single Cereal object
 */
public class Cereal {

	private String name;
	private String type;
	private int calories;
	private int protein;
	private int fat;
	private int sodium;
	private double fiber;
	private double carbs;
	private int sugar;
	private int potassium;
	private int vitamins;
	private int shelf;
	private double weight;
	private double cups;
	private double rating;

	public Cereal(String initName, String initType, int initCal, int initProtein, int initFat, int initSodium,
			double initFiber, double initCarbs, int initSugar, int initPotassium, int initVit, int initShelf,
			double initWeight, double initCups, double initRating) {
		name = initName;
		type = initType;
		calories = initCal;
		protein = initProtein;
		fat = initFat;
		sodium = initSodium;
		fiber = initFiber;
		carbs = initCarbs;
		sugar = initSugar;
		potassium = initPotassium;
		vitamins = initVit;
		shelf = initShelf;
		weight = initWeight;
		cups = initCups;
		rating = initRating;

	}

	public Cereal() {
		name = "";
		type = "C";
		calories = 0;
		protein = 0;
		fat = 0;
		sodium = 0;
		fiber = 0;
		carbs = 0;
		sugar = 0;
		potassium = 0;
		vitamins = 0;
		shelf = 0;
		weight = 0;
		cups = 0;
		rating = 0;

	}

	public Cereal(String initName, int initCal, int initProtein, double initWeight, double initCups,
			double initRating) {
		name = initName;
		type = "C";
		calories = initCal;
		protein = initProtein;
		fat = 0;
		sodium = 0;
		fiber = 0;
		carbs = 0;
		sugar = 0;
		potassium = 0;
		vitamins = 0;
		shelf = 0;
		weight = initWeight;
		cups = initCups;
		rating = initRating;

	}

	public Cereal(String initName, int initCal, double initRating) {
		name = initName;
		type = "C";
		calories = initCal;
		protein = 0;
		fat = 0;
		sodium = 0;
		fiber = 0;
		carbs = 0;
		sugar = 0;
		potassium = 0;
		vitamins = 0;
		shelf = 0;
		weight = 0;
		cups = 0;
		rating = initRating;

	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public int getCalories() {
		return calories;
	}

	public int getProtein() {
		return protein;
	}

	public int getFat() {
		return fat;
	}

	public int getSodium() {
		return sodium;
	}

	public double getFiber() {
		return fiber;
	}

	public double getCarbs() {
		return carbs;
	}

	public int getSugar() {
		return sugar;
	}

	public int getPotassium() {
		return potassium;
	}

	public int getVitamins() {
		return vitamins;
	}

	public int getShelf() {
		return shelf;
	}

	public double getWeight() {
		return weight;
	}

	public double getCups() {
		return cups;
	}

	public double getRating() {
		return rating;
	}

	public String toString() {
		return "Cereal " + name + " Type:" + type + " Calories:" + calories + " Cups:" + cups + " Rating:" + rating;
	}

	public static void main(String[] args) {
		Cereal c1 = new Cereal("Cocoa Puffs", "C", 110, 1, 1, 180, 0, 12, 13, 55, 25, 2, 1, 1, 22.73645);
		System.out.println(c1.toString());

		Cereal c2 = new Cereal("Frosted Flakes", "C", 110, 1, 0, 200, 1, 14, 11, 25, 25, 1, 1, .75, 31.43597);
		System.out.println(c2.toString());

		Cereal c3 = new Cereal();
		System.out.println(c3.getName() + " " + c3.getRating());
	}
}
