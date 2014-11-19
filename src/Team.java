import java.util.Scanner;

public class Team {
	int members;
	int strength;
	int power = 0;
	String teamName;
	int[] teamArray = new int[2];
	Scanner keyInput = new Scanner(System.in);
	
	/**Parametric Team constructor
	 * (If you don't know the param values,
	 * then use the alternate parametric constructor.)**/
	public Team(String name, int quan, int qual) {
		members = quan;
		strength = qual;
		teamName = name;
	}
	/**Alternate parametric Team constructor.
	 * To be used as a substitute for teamQuantifier.
	 * To query for name, pass null.**/
	public Team(String name) {
		if (name == null) {
			System.out.println("What is the name of this team?");
			name = keyInput.nextLine();
		}
		teamName = name;
		System.out.println("How many members does " + teamName + " have?");
		members = keyInput.nextInt();
		System.out.println("And, on a scale of 1-10, how strong is each member of " + teamName + "?");
		strength = keyInput.nextInt();
	}
	/**Power getter (only to be used with a parametric constructor!)**/
	public int getPower() {
		power = members * strength;
		return power;
	}
	
	
	/**Non-parametric Team constructor**/
	public Team() {
		members = 0;
		strength = 0;
		teamName = "";
	}
	/**Power getter (only to be used with non-parametric constructor!)**/
	public int getPower(int quan, int qual) {
		power = quan * qual;
		return power;
	}
	/**Team quantifier (only to be used with non-parametric constructor!)**/
	public int[] teamQuantify(String name) {
		System.out.println("How many members does " + name + " have?");
		teamArray[0] = keyInput.nextInt();
		System.out.println("And, on a scale of 1-10, how strong is each member of " + name + "?");
		teamArray[1] = keyInput.nextInt();
		return teamArray;
	}
}