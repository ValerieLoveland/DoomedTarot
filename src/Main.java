import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Main {
    public static int uprightCardCounter = 0;
    public static int aboutCounter = 0;
    public static int guideCounter = 0;

    public static String choice = null;
    public static int v = 0;
    String filename="saveGame.txt";
    public static Integer[] saveFileValuesArray = new Integer[1000];

    public static Integer[] readFileReturnIntegers(String filename) {

        int i = 0;
        // connect to the file
        File file = new File(filename);
        Scanner inputFile = null;
        try {
            inputFile = new Scanner(file);
        }
        // If file not found-error message
        catch (FileNotFoundException Exception) {
            System.out.println("File not found!");
        }
        // if connected, read file
        if (inputFile != null) {
            // loop through file for integers and store in array
            try {
                while (inputFile.hasNext()) {
                    try {
                        saveFileValuesArray[i] = inputFile.nextInt();
                        i++;
                    } catch (InputMismatchException e) {
                        inputFile.next();
                    }
                }
            } finally {
                inputFile.close();
            }
            return saveFileValuesArray;
        }
        return new Integer[] {};
    }

    public static void printArrayAndIntegerCount(Integer[] temp) {
        for (int i = 0; i < temp.length; i++) {
            System.out.printf("numbers"+ i + temp[i]);
        }

    }



   public static void main(String[] args) {


System.out.println("(type q to exit)");
        System.out.println();

        while (choice != "q") {
            readFileReturnIntegers("saveGame.txt");

            System.out.println(saveFileValuesArray[0]);
            System.out.println(saveFileValuesArray[1]);
            System.out.println(saveFileValuesArray[2]);

            menu();
            chosen();
        }
    }

    //printing out the menu options
    public static void menu() {
       uprightCardCounter = saveFileValuesArray[0];
       aboutCounter = saveFileValuesArray[1];
       guideCounter = saveFileValuesArray[2];
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
                System.out.println(guide.getGuideTalk());
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
                AboutText bio = BiographyText();
                System.out.println(bio.getBiography());
                aboutCounter++;
                break;

            default:
                System.out.println("Please pick a less disturbing option.");

        }
        return choice;
    }


    public static Guide GuideText() {
        GuideIntro guideAnswer = null;
        if (guideCounter == 0) {
            guideAnswer = new GuideIntro();
        } else if (guideCounter == 1) {
            guideAnswer = new GuideIntro.GuideTalk2();
        } else if (guideCounter == 2) {
            guideAnswer = new GuideIntro.GuideTalk3();
        }

        return guideAnswer;
    }

    public static UprightCard DrawUpright() {
        UprightCard cardAnswer = null;
        if (uprightCardCounter == 0) {
            cardAnswer = new UprightCard();
        } else if (uprightCardCounter == 1) {
            cardAnswer = new UprightCard.UprightTower();
        } else if (uprightCardCounter == 2) {
            cardAnswer = new UprightCard.UprightTower.UprightDevil();
        }

        return cardAnswer;
    }

    public static AboutText BiographyText() {
        AboutText answer = null;
        if (aboutCounter == 0) {
            answer = new AboutText();
        } else if (aboutCounter == 1) {
            answer = new AboutText.Biography2();
        } else if (aboutCounter == 2) {
            answer = new AboutText.Biography3();
        }

        return answer;
    }
}


