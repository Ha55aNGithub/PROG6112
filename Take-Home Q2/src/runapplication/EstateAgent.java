/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package runapplication;

/**
 *
 * @author 27691
 */
public abstract class EstateAgent implements iEstateAgent {

    private String estateAgent_Name;
    private double property_Price;

    public EstateAgent(String estateAgent_Name, double property_Price) {

        this.estateAgent_Name = estateAgent_Name;
        this.property_Price = property_Price;
    }

    public String getAgentName() {
        return estateAgent_Name;
    }

    public double getPropertyPrice() {
        return property_Price;
    }

    public double getAgentCommission() {
        return property_Price * 0.20;
    }

}
