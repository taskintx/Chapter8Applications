/*
package YouDoIt;

import java.util.Scanner;

public class BowlingTeamDemo2 {
    public static void main(String[] args) {
        String name;
        final int NUM_TEAMS = 4;
        BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];
        int x;
        int y;
        final int NUM_TEAM_NUMBERS = 4;
        Scanner input = new Scanner(System.in);
        for(y = 0; y < NUM_TEAMS; ++y)
        {
            teams[y] = new BowlingTeam();
            System.out.print("Enter team name >> ");
            name = input.nextLine();
            teams[y].setTeamName(name);
            for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
            {
                System.out.print("Enter team member's name >> ");
                name = input.nextLine();
                teams[y].setMember(x, name);
            }
        }
        System.out.println("\nMembers of team " + bowlTeam.getTeamName());
        for(y = 0; y < NUM_TEAMS; ++y)
        {
            System.out.println("\nMembers of team " +
                    teams[y].getTeamName());
            for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
                System.out.print(teams[y].getMember(x) + " ");
            System.out.println();
        }
    }
}
*/

