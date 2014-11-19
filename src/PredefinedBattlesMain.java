import java.util.Scanner;
public class PredefinedBattlesMain {

	public static void main(String[] args) {
		Scanner keyInput = new Scanner(System.in);
		String version = "1.01";
		int team1Power;
		int team2Power;
		Team team1;
		Team team2;
		
		System.out.println("Welcome to Predefined Battles, version " + version);
		System.out.println("Let's start with Team 1.");
		team1 = new Team("Team 1");
		team1Power = team1.getPower();
		
		/** Old non-parametric way of doing this
		System.out.println("Great! Let's move on to Team 2.");
		team2Array = team.teamQuantify("Team 2");
		team2Members = team2Array[0];
		team2Strength = team2Array[1];
		team2Power = team.getPower(team2Members, team2Strength);**/
		
		System.out.println("Great! Let's move on to Team 2.");
		team2 = new Team("Team 2");
		team2Power = team2.getPower();
		
		if (team1Power > team2Power) {
			System.out.println("Team 1 won!");
		} else if (team1Power < team2Power) {
			System.out.println("Team 2 won!");
		} else {
			System.out.println("The battle resulted in a draw!");
		}
		
		keyInput.close();
	}

}
