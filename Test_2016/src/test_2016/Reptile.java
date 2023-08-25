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
public class Reptile extends Animal {

    private int IDtag;
    private String species;
    private double bloodTemp;

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

    public double getBloodTemp() {
        return bloodTemp;
    }

    public void setBloodTemp(double bloodTemp) {
        this.bloodTemp = bloodTemp;
    }

    @Override
    public void inputMethod() {
        super.inputMethod();
        Scanner hk = new Scanner(System.in);
        System.out.print("Enter the reptiles blood temperature in celcius ");
        bloodTemp = hk.nextDouble();
    }

    @Override
    public void outputMethod() {
        super.outputMethod();
        System.out.println("Reptiles blood temperature is : " + bloodTemp + " degrees Celcius");
    }
}
