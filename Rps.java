import javax.swing.JOptionPane;

public class Rps
{
	public static void main(String[] args)
	{
		int player;
		int computer;
		String message;
		String playerPick;
		String compPick;
		final int LOW = 1;
		final int HIGH = 3;

		// Computers randomly generated selection
		computer = LOW + (int)(Math.random() * HIGH);
		player = Integer.parseInt(JOptionPane.showInputDialog(null, "Type one of the following numbers: \n1 for ROCK \n2 for PAPER \n3 for SCISSORS"));	

		// Turn the numeric choice of the player into a string for output
		if (player == 1)
			playerPick = "ROCK";
		else
			if(player == 2)
				playerPick = "PAPER";
			else
				if(player == 3)
					playerPick = "SCISSORS";
				else
					playerPick = "INVALID CHOICE";

		// Turn the numeric choice of the player into a string for output
		if (computer == 1)
			compPick = "ROCK";
		else
			if(computer == 2)
				compPick = "PAPER";
			else
				compPick = "SCISSORS";

		// Game mechanics
		if(player == 1)
			if(computer == 1)
				message = "OMG ITS A TIE !";
			else 
				if(computer == 2)
					message = "HA HA YOU LOSE !";
				else 
					message = "WINNER CHICKEN DINNER!!!";

		else
			if(player == 2)
				if(computer == 2)
					message = "OMG ITS A TIE !";
				else 
					if(computer == 3)
						message = "HA HA YOU LOSE !";
					else 
						message = "WINNER CHICKEN DINNER!!!";

		else
			if(computer == 3)
				message = "OMG ITS A TIE !";
			else 
				if(computer == 1)
					message = "HA HA YOU LOSE !";
				else 
					message = "WINNER CHICKEN DINNER!!!";

		//Output message dialog box displaying the results
			JOptionPane.showMessageDialog(null, "You chose " + playerPick + "\nThe computer chose pciked " + compPick + "\nResult: " + message);
	}

}