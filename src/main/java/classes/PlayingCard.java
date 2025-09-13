package classes;

import enumerations.Hauteur;
import enumerations.Type;

public class PlayingCard
{
    //Attributes
    Hauteur hauteur;
    Type type;
    String couleur;

    //Constructor
    public PlayingCard(Hauteur hauteur, Type type){
        this.hauteur = hauteur;
        this.type = type;
        if (this.type == Type.COEUR || this.type == Type.CARREAU){
            this.couleur = "Rouge";
        }
    }

    //Methods
    @Override
    public String toString() {
        return "PlayingCard{" +
                "hauteur=" + hauteur +
                ", type=" + type +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
