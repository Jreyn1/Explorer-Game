import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JPanel extends JFrame
	{
		private static final long serialVersionUID = 1L;
		static int startGame;
		static JFrame frame = new JFrame();

		// Code Specific Statics

		static String adventureType;
		static String castleChoice;
		static int scaleChoice;
		static int digChoice;

		public static void intro()
			{
				// Game Intro and Instructions

				// Windows Pop-up

				JOptionPane.showMessageDialog(frame, "Welcome to my game!");

				// Start Game Button

				Object[] options =
					{ "START" };
				startGame = JOptionPane.showOptionDialog(frame, "Press START to start the game", "Your Decision",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

			}

		public static void firstBranch()
			{
				// Drop down options
				final String[] castleChoice =
					{ "Scale the wall", "Dig under the wall" };
				final JFrame frame = new JFrame();
				adventureType = (String) JOptionPane.showInputDialog(frame,
						"You walk up to a castle. You walk up the wall. Do you...", "Adventure Genre",
						JOptionPane.QUESTION_MESSAGE, null, castleChoice, null);

			}

		public static void secondBranch()
			{
				if (adventureType.equals("Scale the wall"))
					{

						// Scale the Wall
						
						JOptionPane.showMessageDialog(frame, "You scale the wall");

						Object[] options =
							{ "Stairs", "Rope" };
						scaleChoice = JOptionPane.showOptionDialog(frame,
								"You see a rope going down into the castle or a staircase leading down one of the towers. Which one do you go down?",
								"Your Choice", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
								options, null);

					}

				else if (adventureType.equals("Dig under the wall"))
					{

						// Dig under the wall

						JOptionPane.showMessageDialog(frame, "You dig under the wall");

						Object[] options1 =
							{ "Stone", "Dirt" };
						digChoice = JOptionPane.showOptionDialog(frame,
								"You approach a wall of stone and a wall of dirt. Which one do you did through?",
								"Your Choice", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
								options1, null);

					}
			}

		public static void thirdBranchResults()
			{
				// Scale Branch

				if (scaleChoice == 0 && adventureType.equals("Scale the wall"))
					{
						//Go down stairs 
						
						JOptionPane.showMessageDialog(frame, "You go down the stairs");
						JOptionPane.showMessageDialog(frame, "Your get caught by the guards");
						System.exit(0);
					}
				else if (scaleChoice == 1 && adventureType.equals("Scale the wall"))
					{
						// Go down rope (Win condition)

						JOptionPane.showMessageDialog(frame, "You choose to go down the rope");
						JOptionPane.showMessageDialog(frame, "You find the treasure");

						// Random Squander Generator

						int randomNumberOfTreasure = (int) (Math.random() * 500 + 1);

						JOptionPane.showMessageDialog(frame, "You get " + randomNumberOfTreasure + " dabloons");
						int randomNumber1 = (int) (Math.random() * 2);
						if (randomNumber1 == 0)
							{
								JOptionPane.showMessageDialog(frame, "You squander your wealth");
							}
						else
							{
								JOptionPane.showMessageDialog(frame,
										"You are smart with your money and will die wealthy");
							}
						System.exit(0);
					}
				

				// dig Branch

				if (digChoice == 0 && adventureType.equals("Dig under the wall"))
					{
						// Dig Through Stone (Lose Condition)

						JOptionPane.showMessageDialog(frame, "You choose to dig through the stone");
						JOptionPane.showMessageDialog(frame, "Your shovel breaks, you are stuck");
						System.exit(0);
					}
				else if (digChoice == 1 && adventureType.equals("Dig under the wall"))
					{
						// Dig Through Dirt (Win Condition)

						JOptionPane.showMessageDialog(frame, "You dig through the dirt");
						JOptionPane.showMessageDialog(frame, "You find the treasure");

						// Random Squander Money

						int randomNumberOfTreasure = (int) (Math.random() * 500 + 1);

						JOptionPane.showMessageDialog(frame, "You get " + randomNumberOfTreasure + " dabloons");

						int randomNumber2 = (int) (Math.random() * 2);
						if (randomNumber2 == 0)
							{
								JOptionPane.showMessageDialog(frame, "You squander your wealth");
							}
						else if (randomNumber2 == 1)
							{
								JOptionPane.showMessageDialog(frame,
										"You are smart with your money and die wealthy");
							}
						System.exit(0);
					}
				

			}
	}
