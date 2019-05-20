import java.util.Scanner;

public class Main {
static String choice=null;



    public static void main(String[] args) {
//        menu();
//        chosen();
        while ((choice == "a")||(choice == "b") || (choice == "c") || (choice == null)){
        menu();
        chosen();

    }}

    public static void menu() {
        System.out.println();
        System.out.println();
        System.out.println("DOOMED Tarot");
        System.out.println();
        System.out.println();
        System.out.println("Choose your fate:");
        System.out.println("Meet your Guide on this ill-fated journey! (Choice A)");
        System.out.println("Daily Card (Choice B)");
        System.out.println("About (Choice C)");


    }


    public static String chosen() {
        Scanner in = new Scanner(System.in);
        String choice = in.nextLine();
        //System.out.println("choice is " + choice);

//        if (choice.equals('A')) {
//            Guide intro = new Guide();
//            intro.setInterpretation("Um, I don’t know why they say the journey is ill-fated. That's a little dramatic! It’s a joke I guess, haha. \n" +
//                    "I am your guide Peggy! I can help you draw and talk about the cards, \n" +
//                    "but remember: I am just an interpreter, the cards and you do all the work!\n");
//
//        } else if (choice == "B") {
//            Card tower = new Card();
//            tower.setName("The Tower/n");
//            tower.setDescription("(Picture of a tower being struck by lightning with people falling out of it)/n");
//            tower.setDialogue("Peggy: Wow, this is a card you would not want to see, but uh, it doesn't necessarily mean something horrible is going to happen. It just usually means that. Another interpretation could be a change. A sudden, shocking change. Not all sudden shocking changes are neccessarily bad, right? Oh well, we'll try again tomorrow.");
//            System.out.println(tower);
//
//        } else if (choice == "C") {
//            About.about();
//
//        } else {
//            System.out.println("Please choose a less disturbing option.");
//
//
//        }


        switch (choice) {
            case "a" :
                //System.out.println("AAAAA");
                Guide intro = new Guide();
                intro.setInterpretation("Um, I don’t know why they say the journey is ill-fated. That's a little dramatic! It’s a joke I guess, haha. \n" +
                        "I am your guide Peggy! I can help you draw and talk about the cards, \n" +
                        "but remember: I am just an interpreter, the cards and you do all the work!\n");
                System.out.println(intro.getInterpretation());
                break;
            case "b":
                //System.out.println("BBBBB");
                Card tower = new Card();
                tower.setName("The Tower");
                tower.setDescription("(Picture of a tower being struck by lightning with people falling out of it)");
                tower.setDialogue("Peggy: Wow, this is a card you would not want to see, but uh, it doesn't necessarily mean something horrible is going to happen. \n It just usually means that. Another interpretation could be a change! A sudden, shocking change. \n Not all sudden shocking changes are neccessarily bad, right? Oh well, we'll try again tomorrow.");
                System.out.println();
                System.out.println(tower.getName());
                System.out.println(tower.getDescription());
                System.out.println();
                System.out.println(tower.getDialogue());
                break;

            case "c":
                //System.out.println("CCCCCC");
                About firstBio = new About();
                firstBio.setBiography("Valerie Loveland is a Computer Science student and Tarot Card enthusiast.\n This is her first tarot app.");
                System.out.println();
                System.out.println(firstBio.getBiography());
                break;

        }
        return choice;
    }


}

