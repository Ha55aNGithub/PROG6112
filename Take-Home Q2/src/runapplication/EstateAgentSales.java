/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package runapplication;

/**
 *
 * @author 27691
 */
public class EstateAgentSales extends EstateAgent {

    private String estateAgent_Name;
    private double property_Price;

    public EstateAgentSales(String estateAgent_Name, double property_Price) {

        super(estateAgent_Name, property_Price);
    }

    public void printPropertyReport() {
        
        System.out.println("");
        System.out.println("ESTATE AGENT REPORT");
        System.out.println("********************");
        System.out.println("ESTATE AGENT NAME: " + getAgentName());
        System.out.println("PROPERTY PRICE: " + "R " + getPropertyPrice());
        System.out.println("AGENT COMMISSION: " + "R " + getAgentCommission());
    }
}
