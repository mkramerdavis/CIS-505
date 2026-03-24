/*  Assignment 2.3.1

    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by M. Kramer-Davis 2026

*/

// package declaration for the Team class. //
package Module_2.TeamApp;
/*
 *  The Team class represents a sports team.
 */
public class Team {

    // Private data fields. //
    private String teamName;
    private String[] players;
    private int playerCount;

    /*
     *  Argument constructor
     *  @param teamName name of the team
     */
    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new String[20];
        this.playerCount = 0;
    } 

    /*
     *  Adds a player to the team.
     * @param playerName name of player
     */
    public void addPlayer(String playerName) {
        if (playerCount < players.length) {
            players[playerCount] = playerName;
            playerCount++;
        }
    } // end of addPlayer method. //

    //Gtetters for players, playerCount, and teamName. //
    
    public String[] getPlayers() {
        return players;
    }

    public int getPlayerCount() {
        return playerCount;
    }

    public String getTeamName() {
        return teamName;
    }    
} // end of Team class.//
