import javax.swing.*;

public class UprightCard extends Card{
    public UprightCard(){
    super("name", "description", "dialogue");
    }//this is one of the places that uses inheritance

//    public UprightCard(String name1, String description1, String dialogue1) {
//    }

    ImageIcon display(){
        return null;
    }
    public String name;
    public  String description;
    public String dialogue;


    public UprightCard(String name, String description, String dialogue){
        this.name = name;
        this.description = description;
        this.dialogue = dialogue;
    }

    public String getName(){
        return this.name;
    }


    public String getDescription(){
        return this.description;
    }


    public String getDialogue(){
        return this.dialogue;


    }



    @Override
    public String UprightTower() {
        return UprightTower();
    }

    @Override
    public String UprightDevil() {
        return UprightDevil();
    }


    public static class UprightTower extends UprightCard {
        public UprightTower() {
            super("UprightTower test", "Tower descript", "Tower dialogue");
        }

        public UprightTower(String name, String description, String dialogue) {
            super("UprightTower test", "Tower descript", "Tower dialogue");
        }


        public static class UprightDevil extends UprightCard {
            public UprightDevil() {
                super("The Devil", "Devil descript", "Devil dialogue");
            }
            public UprightDevil(String name, String description, String dialogue) {
                super("The Devil", "Devil descript", "Devil dialogue");
            }
        }
    }}

