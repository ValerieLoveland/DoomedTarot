import javax.swing.*;

public class FakeCard extends Card{
    private String name;
    private  String description;
    private String dialogue;

    ImageIcon display(){
return null;
    };


    public FakeCard(String name, String description, String dialogue){
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
