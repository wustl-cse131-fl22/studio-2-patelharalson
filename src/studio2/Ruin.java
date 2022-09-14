package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How much money do you want to start with?");
		int startAmount = in.nextInt();
		
		Scanner in2 = new Scanner(System.in);
		System.out.println("What is the win probability?");
		double winChance = (in2.nextDouble())/100.0;
		
		Scanner in3 = new Scanner(System.in);
		System.out.println("What is your win limit?");
		int winLimit = in3.nextInt();
		
		int currentAmount = startAmount;
		
		Scanner in4 = new Scanner(System.in);
		System.out.println("How many days?");
		int dayMax = in4.nextInt();
		
		int day = 0;
	
	while (day <= dayMax)
	{
		int totalSimulations = 0;
		while (currentAmount < winLimit && currentAmount > 0)
		{
			if ((double) Math.random() < winChance)
			{
				currentAmount = currentAmount + 1;
				totalSimulations++;
				
			}
			else
			{
				currentAmount = currentAmount - 1;
				totalSimulations++;
				
			}

		}
		String result;
		if (currentAmount <= 0)
		{
			result = "Ruin";
			System.out.println("Day: " + day);
			System.out.println("Number of plays that day: " + totalSimulations);
			System.out.println("Success or ruin?" + result);
		}
		else if (currentAmount >= winLimit)
		{
			result = "Success";
			System.out.println("Day: " + day);
			System.out.println("Number of plays that day: " + totalSimulations);
			System.out.println("Success or ruin? " + result);
		}
		day++;
		currentAmount = startAmount;
	}
	double expectedRuin;	
	double alpha = (1-winChance)/winChance;
	if (winChance == 0.5)
		{
			expectedRuin = 1-(startAmount/winLimit);
		}
	else
	{
		expectedRuin = (Math.pow(alpha,startAmount)-Math.pow(alpha, winLimit))/1-Math.pow(alpha, winLimit);
	}
		System.out.println("Expected ruin is: " + expectedRuin);
	}

}
