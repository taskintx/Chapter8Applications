package YouDoIt;

import java.util.Scanner;

public class BowlingTeamDemo3 {
    public static void main(String[] args) {
        String name;
        final int NUM_TEAMS = 4;
        BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];
        int x;
        int y;
        final int NUM_TEAM_NUMBERS = 4;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter team name >> ");
        name = input.nextLine();
        for(y = 0; y < NUM_TEAMS; ++y) {
            teams[y] = new BowlingTeam();
        }
        teams[y].setTeamName(name);

        for(x =0; x< NUM_TEAM_NUMBERS ; ++x){
            System.out.println("Enter team member's name >> ");
            name = input.nextLine();
            teams[y].setMember(x, name);
        }
        System.out.println("\nMembers of team " + teams[y].getTeamName());
        for(x = 0; x < NUM_TEAM_NUMBERS; ++x)
            System.out.print(teams[y].getMember(x) + " ");
        System.out.println();
        System.out.println("\n\n Enter a team nae to see its roster >> ");
        name = input.nextLine();
        for(y=0; y< teams.length;++y)
            if(name.equals(teams[y].getTeamName()))
                for(x=0; x < NUM_TEAM_NUMBERS; ++x)
                    System.out.println(teams[y].getMember(x)+ " ");
        System.out.println();
    }
}
