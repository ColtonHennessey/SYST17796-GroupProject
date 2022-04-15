/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public abstract class Blackjack {

    private final String name;//the title of the game
    private ArrayList<Player> players;
	private int roundNumber;/**
	 * the players of the game
	 * @param name
	 */

    public Blackjack(String name) {
        this.name = name;
        players = new ArrayList();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the players of this game
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    /**
     * Play the game. This might be one method or many method calls depending on your game.
     */
    public abstract void play();

    /**
     * When the game is over, use this method to declare and display a winning player.
     */
    public abstract void declareWinner();

	public int getRoundNumber() {
		return this.roundNumber;
	}

	/**
	 * 
	 * @param roundNumber
	 */
	public void setRoundNumber(int roundNumber) {
		this.roundNumber = roundNumber;
	}

	public void addPlayer() {
		// TODO - implement Game.addPlayer
		throw new UnsupportedOperationException();
	}

	public void removePlayer() {
		// TODO - implement Game.removePlayer
		throw new UnsupportedOperationException();
	}

}//end class
