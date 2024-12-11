import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ExplorerGameRunner
	{

		public static void main(String[] args)
			{
				//Greet Player
				JPanel.intro();
				
				
				JPanel.firstBranch();
				JPanel.secondBranch();
				JPanel.thirdBranchResults();
				
				/*
				
//				if (startGame.equals("Start Game"))
					{
						System.out.println("-------------------");

						// Question 1

						System.out.println("You walk up to a castle. You walk up the wall. Do you...");
						System.out.println("	1. Scale the wall");
						System.out.println("	2. Dig under the wall");
						int menuChoice1 = userInput.nextInt();
						if (menuChoice1 == 1)
							{
//								System.out.println("-------------------");

								// Question 2a

								System.out.println(
										"You scale the wall. You see a rope going down into the castle or a staircase leading down one of the towers. Which one do you go down?");
								System.out.println("	1. Rope");
								System.out.println("	2. Stairs");
								int menuChoice2a = userInput.nextInt();
								if (menuChoice2a == 1)
									{
										System.out.println("-------------------");

										// Result 3a

										System.out.println("You find the treasure");
										int randomNumberOfTreasure = (int) (Math.random() * 500 + 1);
										System.out.println("You get " + randomNumberOfTreasure + " dabloons");
										int randomNumber1 = (int) (Math.random() * 2);
										if (randomNumber1 == 0)
											{
												System.out.println("You squander your wealth");
											}
										else
											{
												System.out
														.println("You are smart with your money and will die wealthy");
											}
									}
								else
									{
										System.out.println("-------------------");

										// Result 3b

										System.out.println("You get caught by the guards");
									}
							}
						else
							{
								System.out.println("-------------------");

								// Question 2b

								System.out.println(
										"You dig under the wall. You approach a wall of stone and a wall of dirt. Which one do you did through?");
								System.out.println("	1. Wall of Stone");
								System.out.println("	2. Wall of Dirt");
								int menuChoice2b = userInput.nextInt();
								if (menuChoice2b == 1)
									{
										System.out.println("-------------------");

										// Result 3c

										System.out.println("Your shovel breaks, you are stuck");
									}
								else
									{
										System.out.println("-------------------");

										// Result 3d

										System.out.println("You did through the dirt and find the treausre");
										int randomNumberOfTreasure = (int) (Math.random() * 500 + 1);
										System.out.println("You get " + randomNumberOfTreasure + " dabloons");
										int randomNumber2 = (int) (Math.random() * 2);
										if (randomNumber2 == 0)
											{
												System.out.println("You squander your wealth");
											}
										else
											{
												System.out
														.println("You are smart with your money and will die wealthy");
											}

									}

							}
					}
					*/
			}
	}
