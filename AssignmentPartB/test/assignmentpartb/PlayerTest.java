/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentpartb;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hassan
 */
public class PlayerTest {
//declare var for all three classes
    private Striker striker;
    private Midfielder mid;
    private Defender defender;

    @Test
    public void testStrikerAdded() {

        striker = new Striker("Hassan", 18, "South Africa", 25);

        assertEquals("Hassan", striker.getName());
        assertEquals(18, striker.getAge());
        assertEquals("South Africa", striker.getNation());
        assertEquals(25, striker.getGoals());
        System.out.println("Striker has been added!");
    }

    @Test
    public void testMidfielderAdded() {

        mid = new Midfielder("Zidane", 45, "France", 15);

        assertEquals("Zidane", mid.getName());
        assertEquals(45, mid.getAge());
        assertEquals("France", mid.getNation());
        assertEquals(15, mid.getAssists());
        System.out.println("Midfielder has been added!");
    }

    @Test
    public void testDefenderAdded() {

        defender = new Defender("Ramos", 33, "Spain", 99);

        assertEquals("Ramos", defender.getName());
        assertEquals(33, defender.getAge());
        assertEquals("Spain", defender.getNation());
        assertEquals(99, defender.getTackles());
        System.out.println("Defender has been added!");
    }

    @Test
    public void testStrikerQualifiedForTeam() {

        striker = new Striker("", 0, "", 10);

        assertTrue(striker.getGoals() >= 10);
        System.out.println("Sriker has been put on the scouting list!");
    }

    @Test
    public void testMidfielderQualifiedForTeam() {

        mid = new Midfielder("", 0, "", 15);

        assertTrue(mid.getAssists() >= 15);
        System.out.println("Midfielder has been put on the scouting list!");
    }

    @Test
    public void testDefenderQualifiedForTeam() {

        defender = new Defender("", 0, "", 99);

        assertTrue(defender.getTackles() >= 25);
        System.out.println("Defender has been put on the scouting list!");
    }
}
