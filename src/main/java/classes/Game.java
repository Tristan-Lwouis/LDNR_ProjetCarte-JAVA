package classes;

import java.util.ArrayList;
import java.util.List;

public class Game {

    //Attributes
    private int nbJoueurs;
    private int nbDeck;
    private Player[] joueurs;
    private Deck deck = new Deck();
    private List<PlayingCard> pioche = new ArrayList<>();

    //Constructor
    public Game(int nbJoueurs){
        joueurs = new Player[nbJoueurs];
        for(int i = 0 ; i < nbJoueurs ; i++){
            joueurs[i] = new Player();
        }
        //todo - Lancer la partie avec un seul deck
        deck = new Deck();
        pioche = deck.getCards();
        //todo verifier que les cartes ont bien été ajoutés a la pioche
    }

    public Game(int nbJoueurs, int nbDeck){

    }

    //Methods
    public void start(){
        /** todo
         * Creer le nombre de joueurs
         * Creer la pioche en fonction du nombre de deck demandé
         * Distribuer les cartes aux joueurs
         * */

    }

    public void distribute(int nbCartesHand){
        /** todo
         * 1. Recuperer le nombre de cartes dans la pioche
         * 2. Recuperer le nombre de carte a distribuer
         * 3. Verifier si le nombre de carte distribuer est inferieur au nombre de carte dans la pioche
         * 4. Distribuer les cartes aux joueurs
         * */

        int nbCartePioche = nbDeck *
    }

}
