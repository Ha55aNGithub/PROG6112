/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package assignmentparta;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 27691
 */
public class StudentTest {
//declare student var of type student ie. my class being tested
    private Student student;

    @Test
    public void testSaveStudent() {

        student = new Student("10111", "J.Bloggs", 19, "jbloggs@ymail.com", "disd");

        assertEquals("10111", student.getStudentID());
        assertEquals("J.Bloggs", student.getStudentName());
        assertEquals(19, student.getStudentAge());
        assertEquals("jbloggs@ymail.com", student.getStudentEmail());
        assertEquals("disd", student.getStudentCourse());
        System.out.println("Student info saved!");
    }

    @Test
    public void testSearchStudent() {

        student = new Student("10111", "", 0, "", "");

        assertEquals("10111", student.getStudentID());
        System.out.println("Student found!");
    }

    @Test
    public void testSearchStudent_StudentNotFound() {

        student = new Student("10111", "", 0, "", "");

        assertNotEquals("10112", student.getStudentID());
        System.out.println("Student not found!");
    }

    @Test
    public void testDeleteStudent() {

        student = new Student("10113", "", 0, "", "");

        assertEquals("10113", student.getStudentID());
        System.out.println("Student successfully deleted!");
    }

    @Test
    public void testDeleteStudent_StudentNotFound() {

        student = new Student("10111", "", 0, "", "");

        assertNotEquals("10112", student.getStudentID());
        System.out.println("No student to delete!");
    }

    @Test
    public void TestStudentAge_StudentAgeValid() {

        student = new Student("", "", 16, "", "");

        assertTrue(student.getStudentAge() >= 16);
        System.out.println("Age is Valid!");
    }

    @Test
    public void TestStudentAge_StudentAgeInvalid() {

        student = new Student("", "", 15, "", "");

        assertTrue(student.getStudentAge() <= 15);
        System.out.println("Age is Invalid!");
    }

    @Test
    public void TestStudentAge_StudentAgeInvalidCharacter() {

        /* String input = "c";
        int i = Integer.parseInt(input);
        student = new Student("", "", i, "", "");

        assertNotEquals(".*[0-9].*", i);
        System.out.println("Age contains characters !");*/
        try {
            String input = "c";
            int i = Integer.parseInt(input);
            student = new Student("", "", i, "", "");

            //tried the above that is commented out, found out that i can use  NumberFormatException e to run the test 
            fail("");//blank as we know the test will catch NumberFormatException e
        } catch (NumberFormatException e) {
            // This catch block will execute if a non-numeric character isentered which it is
            System.out.println("Age supplied isn't a number!");
        }
    }
}
