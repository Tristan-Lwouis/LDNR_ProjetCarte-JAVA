package classes;

import java.util.ArrayList;
import java.util.List;

public class Player {

    //Attributes
    private String name;
    private List<PlayingCard> hand = new ArrayList<>();
    private static int numeroJoueur = 0;

    //Constructor
    public Player(){
            this.name = "Joueur " + ++numeroJoueur;
        }

    public Player(String name){
        this.name = name + ++numeroJoueur;
    }

    //Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PlayingCard> getHand() {
        return hand;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Player{");
        sb.append("name='").append(name).append('\'');
        for(PlayingCard card : hand){
            sb.append("\n");
            sb.append(card.toString());
        }
        sb.append('}');
        return sb.toString();
    }
}
