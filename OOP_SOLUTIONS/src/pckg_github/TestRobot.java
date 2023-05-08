package pckg_github;

import java.util.ArrayList;
import java.util.Collections;

public class TestRobot {
	public static void main(String[] args) {

		ArrayList <Robot> robots = generateListOfRobots(7);
		System.out.println(robots);
		Collections.sort(robots);
		System.out.println("Sorted list");
		System.out.println(robots);
		Collections.reverse(robots);
		System.out.println("reverse order:");
		System.out.println(robots);
	}

	private static ArrayList<Robot> generateListOfRobots(int numRobots){
		ArrayList<Robot> robots= new ArrayList<>(numRobots);
		for (int k = 0; k < numRobots; k++) {
			robots.add(new Robot(null));
		}
		return robots;
}

	
}
	


