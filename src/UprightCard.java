import javax.swing.*;

public class UprightCard extends Card {


    public UprightCard() {
        super("name", "description", "dialogue");
    }//this is one of the places that uses inheritance


    ImageIcon display() {
        return null;
    }

    public String name;
    public String description;
    public String dialogue;


    public UprightCard(String name, String description, String dialogue) {
        this.name = name;
        this.description = description;
        this.dialogue = dialogue;
    }

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
    public String UprightTower() {
        return UprightTower();
    }

    @Override
    public String UprightDevil() {
        return UprightDevil();
    }

    @Override
    public String ReversedTower() {
        return ReversedTower();
    }

    @Override
    public String Career() {
        return null;
    }


    public static class UprightTower extends UprightCard {
        public UprightTower() {
            super("The Tower", "A tower with people falling out of it", "Just because a shocking surprise is usually terrible, doesn't mean that every shocking surprise has to be terrible!");
        }

        public UprightTower(String name, String description, String dialogue) {
            super("UprightTower test", "Tower descript2", "Tower dialogue");
        }}//this one


        public static class UprightDevil extends UprightCard {
            public UprightDevil() {
                super("The Devil", "A large man with horns sitting on a throne", "I know we just met, but are you having a sort of anguish?");
            }

            public UprightDevil(String name, String description, String dialogue) {
                super("The Devil", "Devil descript2", "Devil dialogue");
            }
        }

        public static class Upright3Swords extends UprightCard {
            public Upright3Swords() {
                super("Three of Swords", "Three swords piercing a heart", "This card meanse there is someone in your life who you can't trust. Be careful!");
            }

            public Upright3Swords(String name, String description, String dialogue) {
                super("Three of Swords", "3 swords descript2", "3 swords dialogue");
            }
        }

        public static class UprightMoon extends UprightCard {
            public UprightMoon() {
                super("The Moon", "Three people reaching towards the moon", "This card alwas starts arguments because nobody wants to consider there may be emotions they are repressing. I'm not getting involved, but the cards think there is something you need to think about.");
            }

            public UprightMoon(String name, String description, String dialogue) {
                super("The Moon", "Moon descript", "Moon dialogue");
            }
        }

        public static class Upright9Swords extends UprightCard {
            public Upright9Swords() {
                super("Nine of Swords", "Nine Swords hanging over a worried person's head", "No wonder you got the stress card! You've gotten so many ominous cards, it makes sense that you would have anxiety!");
            }

            public Upright9Swords(String name, String description, String dialogue) {
                super("Nine of Swords", "9swords descript", "9 swords dialogue");
            }
        }

        public static class Upright5Pentacles extends UprightCard {
            public Upright5Pentacles() {
                super("Five of Pentacles", "Someone out in the bitter cold", "Have you heard the advice that should have 6 months of expenses saved, just in case? Well, uh, you should definitely do that.?");
            }

            public Upright5Pentacles(String name, String description, String dialogue) {
                super("Five of Pentacles", "5 Pentacles descript2", "5 Pentacles dialogue");
            }
        }

        public static class UprightHangedMan extends UprightCard {
            public UprightHangedMan() {
                super("The Hanged Man", "A person hanging upside down by their foot", "No judgements from me, but the cards want to know if you are sure you are capable of what you are trying to do.");
            }

            public UprightHangedMan(String name, String description, String dialogue) {
                super("The Hanged Man", "Hanged Man descript2", "Hanged man dialogue");
            }
        }
    public static class Upright10Swords extends UprightCard {
        public Upright10Swords() {
            super("Ten of Swords", "A person with 10 swords in their back", "Hear me out on this: if you get stabbed and killed with one sword, the other 9 swords don't hurt at all.");
        }

        public Upright10Swords(String name, String description, String dialogue) {
            super("Ten of Swords", "10 swords descript2", "10 swords dialogue");
        }
    }

    public static class UprightTowerinCareerReading extends UprightCard{
        public UprightTowerinCareerReading() {
            super("The Tower", "A tower with lightning and people falling", "This usually signals something sudden and terrible happens");
        }

        public UprightTowerinCareerReading(String name, String description, String dialogue) {
            super("The Fool (Reversed)", "Reversed Fool descript2", "Reversed Fool dialogue");
        }
    }



 }


