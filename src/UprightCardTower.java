import javax.swing.*;

public class UprightCardTower extends UprightCard{//this is one of the places that uses inheritance
    private ImageIcon tower;


    public UprightCardTower(){

        super("The Tower","(Picture of a tower being struck by lightning with people falling out of it)",
                "\nPeggy: Wow, this is a card you would not want to see, but uh, it doesn't necessarily mean something horrible is going to happen. " +
                        "\n It just usually means that. Another interpretation could be a change! A sudden, shocking change. \n " +
                        "Not all sudden shocking changes are neccessarily bad, right? Oh well, we'll try again tomorrow." );
    }

    @Override
    ImageIcon display(){

        tower = new ImageIcon("the-tower.png");
        JOptionPane.showMessageDialog( null, tower);
        return tower;
    }


}
