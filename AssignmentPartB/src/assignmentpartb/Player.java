/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentpartb;

import static assignmentpartb.AssignmentPartB.players;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 27691
 */
public class Player {
//main class and parent
    public static ArrayList<Player> players = new ArrayList<Player>();
    private String name;
    private int age;
    private String nation;

    public Player(String name, int age, String nation) {

        this.name = name;
        this.age = age;
        this.nation = nation;
    }
//getters n setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }
//all methods below
    public static void welcomeMsg() {

        System.out.println("Welcome to football analyser!");
        System.out.println("Where we help Mid-Table teams evaluate whether a youth player is worth persuing");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Please enter your teams position (number only) in the league to continue!");

        Scanner hk = new Scanner(System.in);
        int input = hk.nextInt();

        if (input >= 8 && input <= 12) {
            menu();
        } else if (input >= 1 && input <= 7) {
            System.out.println("You do not need any more help!");
            System.exit(0);
        } else if (input >= 13 && input <= 20) {
            System.out.println("You are beyond help!");
            System.exit(0);
        } else {
            System.out.println("Invalid input. Please enter a valid league position.");
        }

    }//welcomeMsg()

    public static void menu() {

        Scanner hk = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------");
        System.out.println("What position does the prospect player play in?");
        System.out.println("(1) Striker");
        System.out.println("(2) Midfielder");
        System.out.println("(3) Defender");
        System.out.println("(4) Print Player Details");
        System.out.println("----------------------------------------------------------------");
        System.out.println("(5) About us!");
        System.out.println("(6) Exit.");

        int choice = hk.nextInt();

        switch (choice) {

            case 1:
                striker();
                break;
            case 2:
                midfielder();
                break;
            case 3:
                defender();
                break;
            case 4:
                printSearches();
                break;
            case 5:
                about();
                break;
            default:
                System.out.println("Programme closed.");
                System.exit(0);
        }
    }//menu()

    public static void striker() {
        Scanner hk = new Scanner(System.in);

        System.out.println("----------------------------------------------------------------");
        System.out.println("Enter Striker's name:");
        String strikerName = hk.nextLine();

        System.out.println("Enter Striker's age:");
        int strikerAge = hk.nextInt();
        hk.nextLine();

        System.out.println("Enter Striker's nation:");
        String strikerNation = hk.nextLine();

        System.out.println("Enter number of goals scored by the Striker:");
        int goals = hk.nextInt();

        if (goals > 10) {
            System.out.println(strikerName + " seems like a promising goal machine!");
        } else {
            System.out.println("It would be smart to keep looking");
        }

        Striker striker = new Striker(strikerName, strikerAge, strikerNation, goals);
        players.add(striker);
        menu();
    }//striker()

    public static void midfielder() {

        Scanner hk = new Scanner(System.in);
        System.out.println("Enter Midfielder's name:");
        String midfielderName = hk.nextLine();

        System.out.println("Enter Midfielder's age:");
        int midfielderAge = hk.nextInt();
        hk.nextLine();

        System.out.println("Enter Midfielder's nation:");
        String midfielderNation = hk.nextLine();

        System.out.println("Enter number of assists by the Midfielder:");
        int assists = hk.nextInt();

        if (assists > 15) {
            System.out.println(midfielderName + " seems like a real maestro!");
        } else {
            System.out.println("It would be smart to keep looking");
        }

        Midfielder mid = new Midfielder(midfielderName, midfielderAge, midfielderNation, assists);
        players.add(mid);
        menu();
    }//mid()

    public static void defender() {
        Scanner hk = new Scanner(System.in);
        System.out.println("Enter Defender's name:");
        String defenderName = hk.nextLine();

        System.out.println("Enter Defender's age:");
        int defenderAge = hk.nextInt();
        hk.nextLine();

        System.out.println("Enter Defender's nation:");
        String defenderNation = hk.nextLine();

        System.out.println("Enter number of tackles by the Defender:");
        int tackles = hk.nextInt();

        if (tackles > 25) {
            System.out.println(defenderName + " seems like a proper brick wall!");
        } else {
            System.out.println("It would be smart to keep looking");
        }

        Defender defender = new Defender(defenderName, defenderAge, defenderNation, tackles);
        players.add(defender);
        menu();
    }//defender()

    public static void about() {

        System.out.println("----------------------------------------------------------------");
        System.out.println("Mission Statement:\n"
                + "\nAt our core, we are dedicated to empowering Mid-Table football teams by providing them with comprehensive analysis tools and insights."
                + "\nOur mission is to assist these teams in making informed decisions when evaluating the potential of young talent. "
                + "\nWe aim to support the growth of promising players and contribute to the overall competitiveness and success of Mid-Table teams.\n");
        System.out.println("Vision Statement:\n"
                + "\nOur vision is to become the trusted partner of choice for Mid-Table football teams seeking to harness the potential of youth players. "
                + "\nWe aspire to be the go-to platform for innovative football analysis, offering cutting-edge solutions that enable teams to identify, nurture, and integrate emerging talent seamlessly. "
                + "\nBy fulfilling our vision, we aim to elevate Mid-Table teams to new heights of excellence and contribute to the development of the sport at every level.");
        System.out.println(" ");
        menu();
    }//about

    public static void printSearches() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("Do you wish to see all Players? (Y/N): ");

        Scanner hk = new Scanner(System.in);
        String input = hk.nextLine();

        if (input.equalsIgnoreCase("Y")) {
            if (players.isEmpty()) {
                System.out.println("No players to display.");
            } else {
                System.out.println("Player Details:");
                for (Player player : players) {
                    System.out.println("Name: " + player.getName());
                    System.out.println("Age: " + player.getAge());
                    System.out.println("Nation: " + player.getNation());

                    if (player instanceof Striker) {
                        Striker striker = (Striker) player;
                        System.out.println("Goals: " + striker.getGoals());
                    } else if (player instanceof Midfielder) {
                        Midfielder midfielder = (Midfielder) player;
                        System.out.println("Assists: " + midfielder.getAssists());
                    } else if (player instanceof Defender) {
                        Defender defender = (Defender) player;
                        System.out.println("Tackles: " + defender.getTackles());
                    }

                    System.out.println("----------------------------------------------------------------");
                }
            }
        } else {
            System.out.println("Returning to the menu.");
        }

        menu();
    }//printsearches
}
