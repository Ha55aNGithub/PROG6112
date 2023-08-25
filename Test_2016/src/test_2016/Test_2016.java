/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_2016;

import java.util.Scanner;

/**
 *
 * @author Hassan
 */
public class Test_2016 {

    public static void main(String[] args) {

        Scanner hk = new Scanner(System.in);
        Bird brd = new Bird();
        Reptile rept = new Reptile();

        System.out.println("Enter the ID Tag, Species and Colour of the Bird!");
        brd.inputMethod();

        System.out.println("Enter the ID Tag, Species and Blood Temperature of the Reptile!");
        rept.inputMethod();

        System.out.println("\nBird's Info : ");
        brd.outputMethod();

        System.out.println("\nReptile's Info : ");
        rept.outputMethod();

    }

}
