package classes;

import enumerations.Hauteur;
import enumerations.Type;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    //Attributes
    private List<PlayingCard> Cards = new ArrayList<>();
    public static int nbCartes;

    //Constructor
    public Deck(){
        for(Type t : Type.values()){
            for(Hauteur h : Hauteur.values()){
                PlayingCard card = new PlayingCard(h, t);
                this.Cards.add(card);
                nbCartes++;
            }
        }
        //todo shuffle
    }

    //Methods
    public PlayingCard dealCard(){

    }
}
