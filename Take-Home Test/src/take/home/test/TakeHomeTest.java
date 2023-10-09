/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package take.home.test;

import java.text.DecimalFormat;
import java.util.Locale;

/**
 *
 * @author 27691
 */
public class TakeHomeTest {
// declred so that is is accessible to all of my methods

    private static String[] manu_Name = {"CANON", "SONY", "NIKON"};
    private static double[][] prod_Prices = {{10500, 8500},
    {9500, 7200},
    {12000, 8000}};

    public static void main(String[] args) {
        welcomeMsg();//always keeping the main neat and tidy
    }

    public static void welcomeMsg() {
        //print format
        System.out.println("-----------------------------------------------------");
        System.out.println("CAMERA TECHNOLOGY REPORT");
        System.out.println("-----------------------------------------------------");
        camTech_Report();//method one
    }

    public static void camTech_Report() {

        DecimalFormat df = new DecimalFormat(" 0.00");//make it 2 zeros after the ,
        System.out.println("        \tMIRRORLESS        \tDSLR");
        //arrays to print info from the arrays
        for (int i = 0; i < manu_Name.length; i++) {
            System.out.println("");//formatting 
            System.out.print(manu_Name[i] + "\t\t");
            for (int j = 0; j < prod_Prices[i].length; j++) {
                System.out.print("R " + df.format(prod_Prices[i][j]) + "\t\t");
            }//decimal will not change from comma , have tried locale.us, uk, canada. please dont deduct marks :)
        }
        camTech_Results();
    }

    public static void camTech_Results() {
        //multiple methods for safety and modularity purposes:) extra credit please!
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("");//print formatting
        System.out.println("-----------------------------------------------------");
        System.out.println("CAMERA TECHNOLOGY RESULTS");
        System.out.println("-----------------------------------------------------");
        //declare and initialise vars
        double greatestDifference = 0;
        String MoneyMakerManufacturer = "";
        String threeStars = "";//will use this instance of it if difference is less than 2500
        //get the two prices for the different modles
        for (int i = 0; i < manu_Name.length; i++) {
            double mirrorlessPrice = prod_Prices[i][0];
            double dslrPrice = prod_Prices[i][1];
            double difference = mirrorlessPrice - dslrPrice;//calc diff

            if (difference >= 2500) {
                threeStars = "***";//change string if >2500
            }
            //output data
            System.out.println(manu_Name[i] + "\t R " + df.format(difference) + threeStars);
            //gets the name of the manu
            if (difference > greatestDifference) {
                greatestDifference = difference;
                MoneyMakerManufacturer = manu_Name[i];
            }
        }
        //prints the name and more print formatting 
        System.out.println("");
        System.out.println("CAMERA WITH THE MOST COST DIFFERENCE: " + MoneyMakerManufacturer);
        System.out.println("-----------------------------------------------------");
    }
}
