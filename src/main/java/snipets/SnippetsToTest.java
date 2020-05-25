package snipets;

import common.DiceRoll;
import common.Player;

//import java.beans.JavaBean;
import java.util.Random;
import java.util.Scanner;

//here we can store and test/ code parts

public class SnippetsToTest {
	static Scanner scanner = new Scanner(System.in);
	static Player[] players;
	private static int value;
	private static Random rand = new Random();
	private static int roundPoints = 0;

	public static void main(String[] args) throws InterruptedException {

        value = rand.nextInt(6);
        System.out.println(value);
        
        boolean gameRunning = true;
        boolean[] combinationsChecked = new boolean[15];
        int[] combinationScore = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        String[] combinations = {"Ones", "Twos", "Threes", "Fours", "Fives", "Sixes", "Pair", "Two Pair", 
        		"Three of a Kind", "Four of a Kind", "Small Straight", "Large Straight", "Full House", 
        		"Chance", "Yatzy"};
        String tempBoolString;
        int tempScore = 0;
        int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;
        int temp;
        int[] fiveDice = new int[5];
        
     // Store combinations and what combinations that are checked
        for (int i = 0; i < combinationsChecked.length; i++) {
			combinationsChecked[i] = false; 
		}
        
        while(gameRunning) {
	        
        	
        	
        	
        	
	        // Print Combinations checked or not, and score
	        for (int i = 0; i < combinations.length; i++) {
	        	tempBoolString = Boolean.toString(combinationsChecked[i]) + " " + Integer.toString(combinationScore[i]);
	        	
				System.out.println(combinations[i] + ": " + tempBoolString);
			}
	        
	        
	        
	        // NEW DICEROLL FEATURE, LESS TEXT AND IN SWEDISH
	        
	        //roll five dice
	        for (int i = 0; i < fiveDice.length; i++) {
				fiveDice[i] = DiceRoll.roll();
			}
	        
	        // sorting dice from smallest to largest
	        for (int i = 1; i < fiveDice.length; i++) {
	        	for (int j = i; j > 0; j--) {
	        		if (fiveDice[j] < fiveDice[j - 1]) {
	        			temp = fiveDice[j];
	        			fiveDice[j] = fiveDice[j - 1];
	        			fiveDice[j - 1] = temp;
	        		}
	        	}
	        }
	        System.out.println("Vilka tarningar vill du spara? Skriv 1 for att spara eller 0 for att kasta. T.ex. 0 1 1 0 1 f�r att spara 2a, 3e och 5e t�rningen");
	        System.out.println(java.util.Arrays.toString(fiveDice));
	        
	        // Store choices in str
	        String choice = scanner.nextLine();
	        // Split into string array
	        String[] splitChosen = choice.split(" ");
	        
	        // Parse the string array into an int array
	        int[] dieArr = new int[5];
	        for (int i = 0; i < 5; i++) {
				dieArr[i] = Integer.parseInt(splitChosen[i]);
			}
	        // Just a little pause to build up a suspense
	        Thread.sleep(2000);
	        
	        // Check which dice to reroll
	        for (int i = 0; i < dieArr.length; i++) {
				if (dieArr[i] == 0) {
					fiveDice[i] = DiceRoll.roll();
				}
			}
	        // Print the new array of dice
	        System.out.println(java.util.Arrays.toString(fiveDice));
	        
	        // Waiting for enter to be pressed
	        scanner.nextLine();
	        
	        
	        
	        
	        
	        
	        
	        
	        

	        // Roll Dice, check score in numbers
//	        for (int i = 0; i < fiveDice.length; i++) {
//				fiveDice[i] = DiceRoll.roll();
//			}
//
//	        for (int i = 1; i < fiveDice.length; i++) {
//	        	for (int j = i; j > 0; j--) {
//	        		if (fiveDice[j] < fiveDice[j - 1]) {
//	        			temp = fiveDice[j];
//	        			fiveDice[j] = fiveDice[j - 1];
//	        			fiveDice[j - 1] = temp;
//	        		}
//	        	}
//	        }
//	        
//	        System.out.println("Your dice roll: " + java.util.Arrays.toString(fiveDice));
//	        
//	        for (int i = 0; i < fiveDice.length; i++) {
//				if (fiveDice[i] == 1) { one++; }
//				if (fiveDice[i] == 2) { two++; }
//				if (fiveDice[i] == 3) { three++; }
//				if (fiveDice[i] == 4) { four++; }
//				if (fiveDice[i] == 5) { five++; }
//				if (fiveDice[i] == 6) { six++; }
//			}
//	        
//	        System.out.println("Which numbers do you want to score in?");
//	        System.out.println("1. Ones");
//	        System.out.println("2. Twos");
//	        System.out.println("3. Threes");
//	        System.out.println("4. Fours");
//	        System.out.println("5. Fives");
//	        System.out.println("6. Sixes");
//	        
//	        int choice = scanner.nextInt();
//	        
//	        switch (choice) {
//			case 1:
//				System.out.println("Score in ones: " + (one * 1));
//				tempScore += (one * 1);
//				combinationScore[0] = (one * 1);
//				combinationsChecked[0] = true;
//				break;
//
//			case 2:
//				System.out.println("Score in twos: " + (two * 2));
//				tempScore += (two * 2);
//				combinationScore[1] = (two * 2);
//				combinationsChecked[1] = true;
//				break;
//
//			case 3:
//				System.out.println("Score in threes: " + (three * 3));
//				tempScore += (three * 3);
//				combinationScore[2] = (three * 3);
//				combinationsChecked[2] = true;
//				break;
//
//			case 4:
//				System.out.println("Score in fours: " + (four * 4));
//				tempScore += (four * 4);
//				combinationScore[3] = (four * 4);
//				combinationsChecked[3] = true;
//				break;
//
//			case 5:
//				System.out.println("Score in fives: " + (five * 5));
//				tempScore += (five * 5);
//				combinationScore[4] = (five * 5);
//				combinationsChecked[4] = true;
//				break;
//
//			case 6:
//				System.out.println("Score in sixes: " + (six * 6));
//				tempScore += (six * 6);
//				combinationScore[5] = (six * 6);
//				combinationsChecked[5] = true;
//				break;
//				
//			default:
//				break;
//			}
//			
//	        // Small Straight
//	        for (int i = 0; i < fiveDice.length; i++) {
//				if (fiveDice[i] == (i + 1)) {
//					System.out.println("Score in small straight: 15");
//					tempScore += 15;
//					combinationScore[6] = 15;
//					combinationsChecked[6] = true;
//				}
//				else {
//					tempScore += 0;
//					combinationsChecked[6] = true;
//				}
//			}
//	        // Regular Straight 
//	        for (int i = 0; i < fiveDice.length; i++) {
//				if (fiveDice[i] == (i + 2)) {
//					System.out.println("Score in regular straight: 20");
//					tempScore += 20;
//					combinationScore[7] = 20;
//					combinationsChecked[7] = true;
//				}
//				else {
//					tempScore += 0;
//					combinationsChecked[7] = true;
//				}
//			}
        }
    }
}
