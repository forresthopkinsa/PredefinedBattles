import java.util.Scanner;
public class PredefinedBattlesMain {

	public static void main(String[] args) {
		Scanner keyInput = new Scanner(System.in);
		String version = "0.8";
		int team1Members = 0;
		int team2Members = 0;
		int team1Strength = 1;
		int team2Strength = 1;
		int team1Power;
		int team2Power;
		int team1Array[] = new int[2];
		int team2Array[] = new int[2];
		Team team = new Team();
		Team team1;
		
		System.out.println("Welcome to Predefined Battles, version " + version);
		System.out.println("Let's start with Team 1.");
		team1 = new Team("Team 1");
		team1Power = team1.getPower();
		
		System.out.println("Great! Let's move on to Team 2.");
		team2Array = team.teamQuantify("Team 2");
		team2Members = team2Array[0];
		team2Strength = team2Array[1];
		team2Power = team.getPower(team2Members, team2Strength);
		
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
