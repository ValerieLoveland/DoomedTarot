/*
			Name: Valerie Loveland
			Date: 06/04/2019
			Assignment: 3
			File: Reversed Card
			Description: This class is for Reversed card because it will display in a different way eventually and
			    also so I can impliment only reversed or upright for a plot point later

*/

import javax.swing.*;

public class ReversedCard extends UprightCard {
    public ReversedCard() {
        super("name", "description", "dialogue");
    }

    public String name;
    public String description;
    public String dialogue;


    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDialogue() {
        return this.dialogue;
    }
    public String toString() {
        return "name: " + this.name + " description: " + this.description + " dialogue: " + this.dialogue;
    }



    @Override
    ImageIcon display() {
        return null;
    }

    @Override
    public String UprightTower() {
        return null;
    }

    @Override
    public String UprightDevil() {
        return null;
    }

    @Override
    public String ReversedTower() {
        return null;
    }

    public static class ReversedTower extends UprightCard {
        public ReversedTower() {
            super("The Tower (Reversed)", "The card looks upright but the tower itself is upside down", "Peggy: This one is weird! Usually the whole card is reversed, not just the Tower! So if this is reversed, usually it means medical problems. I hope you are feeling okay!");
        }

        public ReversedTower(String name, String description, String dialogue) {
            super("Reversed Tower test", "Reversed Tower descript2", "Reversed Tower dialogue");
        }//this one
    }

    public static class ReversedFool extends UprightCard {
        public ReversedFool() {
            super("The Fool (Reversed)", "A whimsical woman about to whimsically walk off a cliff", "Double check your work! This card shows up when you have or are about to make a careless mistake");
        }

        public ReversedFool(String name, String description, String dialogue) {
            super("The Fool (Reversed)", "Reversed Fool descript2", "Reversed Fool dialogue");
        }
    }

    public static class ReversedFoolinCareerReading extends UprightCard {
        public ReversedFoolinCareerReading() {
            super("The Fool (Reversed)", "A whimsical woman about to whimsically walk off a cliff", "It looks like you are about to find out you are wrong");
        }

        public ReversedFoolinCareerReading(String name, String description, String dialogue) {
            super("The Fool (Reversed)", "Reversed Fool descript2", "Reversed Fool dialogue");
        }
    }

}
//I have this commented out because I want to see this simpler








   // public static class ReversedFool extends UprightCard {
   // }
//}

//    public static class Upright3Swords extends UprightCard {
//        public Upright3Swords() {
//            super("Three of Swords", "Three swords piercing a heart", "This card meanse there is someone in your life who you can't trust. Be careful!");
//        }
//
//        public Upright3Swords(String name, String description, String dialogue) {
//            super("Three of Swords", "3 swords descript2", "3 swords dialogue");
//        }
//    }
//
//    public static class UprightMoon extends UprightCard {
//        public UprightMoon() {
//            super("The Moon", "Three people reaching towards the moon", "This card alwas starts arguments because nobody wants to consider there may be emotions they are repressing. I'm not getting involved, but the cards think there is something you need to think about.");
//        }
//
//        public UprightMoon(String name, String description, String dialogue) {
//            super("The Moon", "Moon descript", "Moon dialogue");
//        }
//    }
//
//    public static class Upright9Swords extends UprightCard {
//        public Upright9Swords() {
//            super("Nine of Swords", "Nine Swords hanging over a worried person's head", "No wonder you got the stress card! You've gotten so many ominous cards, it makes sense that you would have anxiety!");
//        }
//
//        public Upright9Swords(String name, String description, String dialogue) {
//            super("Nine of Swords", "9swords descript", "9 swords dialogue");
//        }
//    }
//
//    public static class Upright5Pentacles extends UprightCard {
//        public Upright5Pentacles() {
//            super("Five of Pentacles", "Someone out in the bitter cold", "Have you heard the advice that should have 6 months of expenses saved, just in case? Well, uh, you should definitely do that.?");
//        }
//
//        public Upright5Pentacles(String name, String description, String dialogue) {
//            super("Five of Pentacles", "5 Pentacles descript2", "5 Pentacles dialogue");
//        }
//    }
//
//    public static class UprightHangedMan extends UprightCard {
//        public UprightHangedMan() {
//            super("The Hanged Man", "A person hanging upside down by their foot", "No judgements from me, but the cards want to know if you are sure you are capable of what you are trying to do.");
//        }
//
//        public UprightHangedMan(String name, String description, String dialogue) {
//            super("The Hanged Man", "Hanged Man descript2", "Hanged man dialogue");
//        }
//    }
//    public static class Upright10Swords extends UprightCard {
//        public Upright10Swords() {
//            super("Ten of Swords", "A person with 10 swords in their back", "Hear me out on this: if you get stabbed and killed with one sword, the other 9 swords don't hurt at all.");
//        }
//
//        public Upright10Swords(String name, String description, String dialogue) {
//            super("Ten of Swords", "10 swords descript2", "10 swords dialogue");
//        }
//    }


