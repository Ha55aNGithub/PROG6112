/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentpartb;

/**
 *
 * @author 27691
 */
public class Midfielder extends Player {

    private int assists;

    public Midfielder(String name, int age, String nation, int assists) {
        super(name, age, nation);
        this.assists = assists;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

}
