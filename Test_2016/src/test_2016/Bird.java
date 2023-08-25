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
public class Bird extends Animal {

    private int IDtag;
    private String species;
    private String colour;

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

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public void inputMethod() {
        super.inputMethod();
        Scanner hk = new Scanner(System.in);
        System.out.print("Enter feather colour (grey, white, black): ");
        colour = hk.nextLine();

    }

    @Override
    public void outputMethod() {
        super.outputMethod();
        System.out.println("Feather Color: " + colour);
    }

}
