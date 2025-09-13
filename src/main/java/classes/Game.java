package classes;

import java.util.ArrayList;
import java.util.List;

public class Game {

    //Attributes
    private final Players[] joueurs;
    private final Deck deck = new Deck();
    private final List<PlayingCard> pioche = new ArrayList<>();

    //Constructor
    public Game(int nbJoueurs){
        joueurs = new Players[nbJoueurs];
        for(int i = 0 ; i < nbJoueurs ; i++){
            joueurs[i] = new Players();
        }
        this.ajouterDeckPioche(1);
    }

    public Game(int nbJoueurs, int nbDeck){
        this(nbJoueurs);
        this.ajouterDeckPioche(nbDeck-1);
    }

    //Methods

    /**
     * 1. Recuperer le nombre de cartes dans la pioche ✅
     * 2. Recuperer le nombre de carte a distribuer ✅
     * 3. Verifier si le nombre de carte distribuer est inferieur au nombre de carte dans la pioche ✅
     * 4. Distribuer les cartes aux joueurs
     * */
    public void distribute(int nbCartesHand) throws IllegalArgumentException{
        if(nbCartesHand <= 0)
            throw new  IllegalArgumentException("Le nombre de carte par joueur doit etre au moins de 1 !");
        else if(nbCartesHand * joueurs.length > pioche.size())
            throw new IllegalArgumentException("Le nombre de carte dans la pioche n'est pas assez grand !");

        for(Players p : joueurs){
            for(int i = 0 ; i < nbCartesHand ; i++){
                    //Duplique la premiere carte du deck dans la pioche du joueur
                    p.addCard(pioche.getFirst());
                    //Supprime la premiere carte de la pioche
                    pioche.remove(pioche.getFirst());
            }
        }
        System.out.println("Il reste " + pioche.size() + " cartes dans la pioche !");
        System.out.println("Chaque jour a recu : " + nbCartesHand + " cartes.");
    }

    /**
     * Ajouter un nombre de deck a la pioche
     * */
    public void ajouterDeckPioche(int nbDeck) throws IllegalArgumentException {
        if(nbDeck <= 0){
            throw new IllegalArgumentException("Le nombre de deck doit etre superieur a 1");
        }
        for(int i = 0 ; i < nbDeck ; i++){
            pioche.addAll(deck.getCards());
        }
        System.out.println("Pioche de cartes : " + pioche.size());
    }



}
