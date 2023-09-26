/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentpartb;

/**
 *
 * @author 27691
 */
public class Defender extends Player {

    private int tackles;

    public Defender(String name, int age, String nation, int tackles) {
        super(name, age, nation);
        this.tackles = tackles;
    }

    public int getTackles() {
        return tackles;
    }

    public void setTackles(int tackles) {
        this.tackles = tackles;
    }

}
