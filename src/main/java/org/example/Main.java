package org.example;

import classes.Deck;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println( "Project Carte start !");

        //Création du deck
        Deck deck = new Deck();
        //Affichage du deck
        System.out.println(deck.toString());

    }
}