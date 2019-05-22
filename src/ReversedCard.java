import javax.swing.*;


public class ReversedCard extends Card{
    private ImageIcon tower;
    private String name;
    private  String description;
    private String dialogue;

    ImageIcon display(){
         tower = new ImageIcon("the-tower.png");
        JOptionPane.showMessageDialog( null, tower);
        return tower;
    };



    void displayFlipped(){

    }


    public ReversedCard(String name, String description, String dialogue){
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
