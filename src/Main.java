import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Main {
    public static int uprightCardCounter = 0;
    public static int aboutCounter = 0;
    public static int guideCounter = 0;
    public static int readingCounter = 0;


    public static String choice = null;
    public static int v = 0;
    String filename="saveGame.txt";
    public static Integer[] saveFileValuesArray = new Integer[10];

    //This is to read in the values from the save file and also has the exception handling
    public static Integer[] readSaveFile(String filename) {//this is to read the save file for the place in the game
        int i = 0;
        File fileToRead = new File(filename);
        Scanner saveGameFile = null;
        try {
            saveGameFile = new Scanner(fileToRead);
        }
        // This makes file not found message
        catch (FileNotFoundException Exception) {
            System.out.println("File not found");
        }
        // reads file, int by int
        if (saveGameFile != null) {
            try {
                while (saveGameFile.hasNext()) {
                    try {
                        saveFileValuesArray[i] = saveGameFile.nextInt();
                        i++;
                    } catch (InputMismatchException e) {
                        saveGameFile.next();
                    }
                }
            } finally {
                saveGameFile.close();
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
            readSaveFile("saveGame.txt");

//I have this part here for testing the save file
//            System.out.println(saveFileValuesArray[0]);
//            System.out.println(saveFileValuesArray[1]);
//            System.out.println(saveFileValuesArray[2]);
           // MulticardReading();
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
        System.out.println("A Reading (Choice E)");


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
                SaveTheGame();
                break;

            case "b"://Daily card
                UprightCard card = DrawUpright();
                System.out.println(card.getName());
                System.out.println(card.getDescription());
                System.out.println(card.getDialogue());
                uprightCardCounter++;
                SaveTheGame();
                break;

            case "c": //About
                AboutText bio = BiographyText();
                System.out.println(bio.getBiography());
                aboutCounter++;
               SaveTheGame();
                break;

            case "d"://save game

                SaveTheGame();
                break;

            case "e"://print reading

                Reading career = MulticardReading();
                System.out.println(career.getName());
                System.out.println(career.getDescription());
                System.out.println(career.getDialogue());
                System.out.println();
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
            cardAnswer = new ReversedCard.ReversedTower();
        } else if (uprightCardCounter == 1) {
            cardAnswer = new ReversedCard.ReversedFool();
//        } else if (uprightCardCounter == 2) {
//            cardAnswer = new UprightCard.UprightDevil();
//        }else if (uprightCardCounter == 3) {
//            cardAnswer = new UprightCard.Upright5Pentacles();
//        }else if (uprightCardCounter == 4) {
//            cardAnswer = new UprightCard.Upright9Swords();
//        }else if (uprightCardCounter == 5) {
//            cardAnswer = new UprightCard.UprightHangedMan();
//        }else if (uprightCardCounter == 6) {
//            cardAnswer = new UprightCard.UprightMoon();
//        }else if (uprightCardCounter == 7) {
//            cardAnswer = new UprightCard.Upright10Swords();
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

    public static Reading MulticardReading(){
        Reading readingAnswer = null;
        if (readingCounter == 0) {
            readingAnswer = new Reading();



//            for( T i : cardsInCareerReading) {
//                System.out.println(i);}


        }

        return readingAnswer;
    }
    //This section shows the output of the values for the save file
    public static void SaveTheGame(){
       try {
            PrintStream saveFile = new PrintStream("saveGame.txt");
            saveFile.println(uprightCardCounter);
            saveFile.println(aboutCounter);
           saveFile.println(guideCounter);
            saveFile.close();
        } catch (IOException e) {
            System.out.println("Error:" + e.toString());
        }
    }



}



