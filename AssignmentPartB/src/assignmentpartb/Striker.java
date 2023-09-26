/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentpartb;

/**
 *
 * @author 27691
 */
public class Striker extends Player {

    private int goals;

    public Striker(String name, int age, String nation, int goals) {
        super(name, age, nation);
        this.goals = goals;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

}
