/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 *@author elizabeth antony
 */
public class Card {
    private Suit suit;
private Value value;

public Card(Suit suit, Value value){
    this.value =value;
    this.suit = suit;
}

public String toString(){
    return this.suit.toString()+"-"+this.value.toString();
}
public Value getValue(){
    return this.value;
}


}
