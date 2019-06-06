/*
			Name: Valerie Loveland
			Date: 06/04/2019
			Assignment: 3
			File: Reading
			Description: This class is for Readings with more than one card. So far I only have one reading,
			I want to incorporate more.
			Working on this

*/

import java.util.ArrayList;

public class Reading<T extends Card> {
    private String name;
    private String description;
    private String dialogue;


    public ArrayList<T> cardsInCareerReading = new ArrayList<>();
    public ArrayList<T> cardsInRelationshipReading = new ArrayList<>();
    public ArrayList<T> cardsInMoneyReading = new ArrayList<>();

    public Reading(String name, String description, String dialogue) {
        this.name = name;
        this.description = description;
        this.dialogue = dialogue;

    }

    public Reading() {
        this.name = "Peggy: These two cards together, are pretty bad together, sorry!";
        this.description = "Peggy: How do you feel about your job? ";
        this.dialogue = "Peggy: Do you think your job is going as poorly as the cards are saying?";

        //reading();
        cardsInCareerReading.add((T) new UprightCard.UprightTowerinCareerReading());
        cardsInCareerReading.add((T) new ReversedCard.ReversedFoolinCareerReading());
        for (int i = 0; i < cardsInCareerReading.size(); i++) {
            System.out.println("Card " + (i + 1));
            System.out.println(cardsInCareerReading.get(i));

        }
        System.out.println();
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getDialogue() {
        return dialogue;
    }

}
