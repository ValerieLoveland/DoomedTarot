import java.util.Scanner;

public class Main {
    static String choice = null;
    static int guideCounter = 0;
    static int uprightCardCounter = 0;
    static int aboutCounter = 0;


    public static void main(String[] args) {

        //System.out.println("(type q to exit)");
        System.out.println();
        while (choice != "q") {
            menu();
            chosen();


        }
    }

    //printing out the menu options
    public static void menu() {
        System.out.println();
        System.out.println();
        System.out.println("DOOMED Tarot");
        System.out.println();
        System.out.println();
        System.out.println("Choose your fate:");
        System.out.println("Meet your Guide on this ill-fated journey! (Choice A)");
        System.out.println("Daily card that will not save you. (Choice B)");
        System.out.println("About (Choice C)");


    }

    //this method takes the menu choice and uses it to run the other classes
    public static String chosen() {
        Scanner in = new Scanner(System.in);
        String choice = in.nextLine();
        choice = choice.toLowerCase();

        //switch to run what the user chose from the menu
        switch (choice) {//all of these use polymorphism because these all use the same methods to get different cards/classes
            case "a":
                Guide guide = GuideText();
                System.out.println(guide.conversation());
                guideCounter++;
                break;

            case "b"://Daily card
                UprightCard card = DrawUpright();
                System.out.println(card.getName());
                System.out.println(card.getDescription());
                System.out.println(card.getDialogue());
                uprightCardCounter++;
                break;

            case "c": //About
                About firstBio = new About();
                firstBio.setBiography("Valerie Loveland is a Computer Science student and Tarot Card enthusiast.\n " +
                        "This is her first tarot app.");
                System.out.println();
                System.out.println(firstBio.getBiography());
                break;

            default:
                System.out.println("Please pick a less disturbing option.");

        }
        return choice;
    }

    public static Guide GuideText() {
        if (guideCounter == 0) {
            return new GuideIntro();
        } else if (guideCounter == 1) {
        }
        return new GuideDailogueSecond();
    }

    public static UprightCard DrawUpright() {
        if (uprightCardCounter == 0) {
            return new UprightCardTower();
        } else if (uprightCardCounter == 1) {
        }
        return new UprightCardDevil();
    }

}

