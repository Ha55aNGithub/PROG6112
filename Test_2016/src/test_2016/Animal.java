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
public class Animal {

    private int IDtag;
    private String species;

    public int getIDtag() {
        return IDtag;
    }

    public void setIDtag(int IDtag) {
        this.IDtag = IDtag;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void inputMethod() {
        Scanner hk = new Scanner(System.in);
        System.out.print("Enter ID Tag: ");
        IDtag = hk.nextInt();
        hk.nextLine();
        System.out.print("Enter Species: ");
        species = hk.nextLine();
    }

    public void outputMethod() {
        System.out.println("IDtag: " + IDtag);
        System.out.println("Species: " + species);
    }

}
