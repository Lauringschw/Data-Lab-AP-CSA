public class Main {

	//main tester
	public static void main(String[] args) {
		//cereal constructor wih all parameters
		Cereal c1 = new Cereal("Frosted Flakes", "C", 110, 1, 0, 200, 1, 14, 11, 25, 25, 1, 1, .75, 31.43597);
		System.out.println(c1.toString());
		//cereal constructor with some parameters
		Cereal c2 = new Cereal("Cocoa Puffs", "C", 110, 1, 1, 180, 0, 12, 13, 55, 25, 2, 1, 1, 22.73645);
		System.out.println(c2.toString());
		//cereal constructor without parameters
		Cereal c3 = new Cereal();
		System.out.println(c3.getName() + " " + c3.getRating());
	}

}


