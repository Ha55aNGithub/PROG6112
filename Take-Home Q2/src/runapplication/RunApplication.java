/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runapplication;

import java.util.Scanner;

/**
 *
 * @author 27691
 */
public class RunApplication {

    public static void main(String[] args) {
        
        Scanner hk = new Scanner(System.in);
        System.out.print("Enter the current estate agent name: ");
        String estateAgent_Name = hk.nextLine();
        System.out.print("Enter the property price: ");
        int property_Price = hk.nextInt();

        EstateAgentSales agent_Report = new EstateAgentSales(estateAgent_Name, property_Price);

        agent_Report.printPropertyReport();
    }

}
