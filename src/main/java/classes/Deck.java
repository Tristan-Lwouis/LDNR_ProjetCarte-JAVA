package classes;

import enumerations.Hauteur;
import enumerations.Type;

import java.util.ArrayList;
import java.util.Collections;
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
        this.Shuffle(this.Cards);
    }

    //Methods
    public void Shuffle(List<PlayingCard> cards){
        Collections.shuffle(cards);
    }

    //todo Distribute()

    public List<PlayingCard> getCards() {
        return Cards;
    }

    //todo toString()

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Deck{");
        sb.append("Deck =\n");
        int numeroCarte = 1;
        for(PlayingCard card : this.Cards){
            sb.append("Carte numéro : ");
            sb.append(numeroCarte++);
            sb.append(" ");
            sb.append(card.toString());
            sb.append("\n");
        }
        sb.append('}');
        return sb.toString();
    }
}

