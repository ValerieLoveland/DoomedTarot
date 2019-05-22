import javax.swing.*;

public class UprightCard extends Card{//this is one of the places that uses inheritance
    private String name;
    private  String description;
    private String dialogue;

    ImageIcon display(){
return null;

    }



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


}
