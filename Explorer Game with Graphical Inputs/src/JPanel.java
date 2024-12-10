import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JPanel extends JFrame
	{
		private static final long serialVersionUID = 1L;
		static int startGame;
		static JFrame frame = new JFrame();

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

			}

	}
