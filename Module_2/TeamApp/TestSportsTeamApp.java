/*  Assignment 2.3.2

    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by M. Kramer-Davis 2026

*/

// package declaration for the TestSportsTeamApp class. //
package Module_2.TeamApp;

// Importing Scanner class for user input. //
import java.util.Scanner;

/*
 *  Test application for Team class
 */
public class TestSportsTeamApp {

        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String continueChoice = "y";
        
        System.out.println("\n  Welcome to the SportsTeam App!");

        while (continueChoice.equalsIgnoreCase("y")) {

            // Prompt for team name. //
            System.out.print("\n  Enter a team name: ");
            String teamName = input.nextLine();

            // Create Team object. //
            Team team = new Team(teamName);

            // Prompt for players. //
            System.out.print("\n  Enter player names: " + "\n    hint: use cammas for multipe players; no spaces>: ");
            String playerInput = input.nextLine();

            // Split input into array. //
            String[] playerArray = playerInput.split(",");

            // Add players to team. //
            for (String player : playerArray) {
                team.addPlayer(player);
            }

            // Display results. //
            System.out.println("\n  --" + team.getTeamName() + " Team Summary--");

            System.out.println("  Number of players in team: " + team.getPlayerCount());

            System.out.print("  Players on team: ");
            String[] players = team.getPlayers();

            for (int i = 0; i < team.getPlayerCount(); i++) {
                System.out.print(players[i]);

                if (i < team.getPlayerCount() - 1) {
                    System.out.print(", ");
                }
            }

            System.out.println("\n");

            // Ask user to continue. //
            System.out.print("  Continue? (y/n): ");
            continueChoice = input.nextLine();
            System.out.println("\n\n  End of line...");
        }

        input.close();
    }// end of main method. //
    
}// end of TestSportsTeamApp class. //
