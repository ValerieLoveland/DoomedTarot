import java.util.ArrayList;

public class Reading<T extends Card> {
    private String name;
    private String description;
    private String dialogue;

//    public static class UprightTower extends UprightCard {
//        public UprightTower() {
//            super("The Tower", "A tower with people falling out of it", "Just because a shocking surprise is usually terrible, doesn't mean that every shocking surprise has to be terrible!");
//        }
//
//        public UprightTower(String name, String description, String dialogue) {
//            super("UprightTower test", "Tower descript2", "Tower dialogue");
//        }}




    public ArrayList<T> cardsInCareerReading = new ArrayList<>();
    public ArrayList<T> cardsInRelationshipReading = new ArrayList<>();
    public ArrayList<T> cardsInMoneyReading = new ArrayList<>();

    public Reading(String name, String description, String dialogue) {
        this.name = name;
        this.description = description;
        this.dialogue = dialogue;

    }

    public Reading() {
        //reading();
        cardsInCareerReading.add((T) new UprightCard.UprightTowerinCareerReading());
        cardsInCareerReading.add((T) new ReversedCard.ReversedFoolinCareerReading());
        for (int i = 0; i < cardsInCareerReading.size(); i++) {
            System.out.println("Card " + i);
            System.out.println(cardsInCareerReading.get(i));

        }

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
//    private void reading() {
//        boolean addingToCareerReading = cardsInCareerReading.add((T) new UprightCard.UprightTowerinCareerReading());
//        boolean addingToCareerReading2 = cardsInCareerReading.add((T) new ReversedCard.ReversedFoolinCareerReading());
//        for (int i = 0; i < cardsInCareerReading.size(); i++) {
//            System.out.println("Card " + i);
//            System.out.println(cardsInCareerReading.get(i));
//            System.out.println(cardsInCareerReading.description(i));
//            System.out.println(cardsInCareerReading.getDescription());
//            System.out.println(cardsInCareerReading.getDialogue());
//            for( T i : cardsInCareerReading) {
//                System.out.println(i);
//
//            }
}
//
//    public void career(T Card) {
//        //answer = new AboutText.Biography3();
//        boolean addingToCareerReading = cardsInCareerReading.add((T) new UprightCard.UprightTowerinCareerReading());
//        boolean addingToCareerReading2 = cardsInCareerReading.add((T) new ReversedCard.ReversedFool());
//        for (int i = 0; i < cardsInCareerReading.size(); i++) {
//            System.out.println("Card " + i);
//            System.out.println(cardsInCareerReading.get(i));
//
//        }
//    }




