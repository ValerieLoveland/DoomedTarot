import javax.swing.*;

abstract class Card {
    public String name;
    public  String description;
    public String dialogue;


    public Card() {

    }

    public Card(String name, String description, String dialogue){
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
//abstract class

    abstract ImageIcon display();

    public abstract String UprightTower();

    public abstract String UprightDevil();
}