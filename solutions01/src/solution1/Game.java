package solution1;

import java.util.List;
import java.util.Scanner;

public class Game {
	private static boolean status = true;
	private static Scanner gameScanner;
	private static int wonGames;
	private static int playedGames;
	
	
	public static void playGame(Scanner scanner) {
		gameScanner = scanner;
		AUXCLS.readDataFromFile("data.txt");
		List<String> cnts = AUXCLS.getLista();
		wonGames = 0;
		playedGames = 0;
		while (status) {
			playedGames++;
			String cnt2guess= AUXCLS.getRandomCountryToGuess();
			AUXCLS.providePrintWithUnderScores(cnt2guess);
			System.out.println("Enter your guess");
			String guess = scanner.nextLine();
			if(cnt2guess.equals(guess)) {
				System.out.println("Country : " + cnt2guess + " | " + " guess: " + guess);
				System.out.println("You have won!!");
				wonGames++;
				choosePlayingOrNot();
				
			}else {
				System.out.println("You missed!! ");
				System.out.println("Country : " + cnt2guess + " | " + " guess: " + guess);
				choosePlayingOrNot();
				
			}
			
		}
		
		showGameStat();
	}
	private static void choosePlayingOrNot() {
		System.out.println("Continue - y or n!");
		String cont = gameScanner.nextLine();
		if(cont.equalsIgnoreCase("y")) {
			System.out.println("You chose continue!!");
		}else {
			System.out.println("Out of game...");
			status = false;
		}
		
	}
	private static void showGameStat() {
		System.out.println("----------------------------------------------------");
		System.out.println("game finished!");
		System.out.println("played total: " + playedGames + " | " + "won total games:: " + wonGames);
		float percentage = (float) wonGames/playedGames;
		System.out.printf("Percentage of wins: %2.2f %%", percentage*100);
		
		
	}

}
