import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradesTest {
    private Grades grades;

    @BeforeEach
    public void newGrades() {
        grades = new Grades();
    }

    @Test
    public void testNoGrades() {
        assertEquals(0, grades.getGradeCount());
        assertEquals(0, grades.getMaxGrade());
        assertEquals(0, grades.getMinGrade());
        assertEquals(0, grades.getAverageGrade());
    }

    @Test
    public void testOneGrade() {
        grades.addGrade(80);

        assertEquals(1, grades.getGradeCount());
        assertEquals(80, grades.getMaxGrade());
        assertEquals(80, grades.getMinGrade());
        assertEquals(80, grades.getAverageGrade());
    }

    @Test
    public void testTwoGrades() {
        grades.addGrade(80);
        grades.addGrade(90);

        assertEquals(2, grades.getGradeCount());
        assertEquals(90, grades.getMaxGrade());
        assertEquals(80, grades.getMinGrade());
        assertEquals(85, grades.getAverageGrade(), 0.0001);
    }

    @Test
    public void testThreeGrades() {
        grades.addGrade(80);
        grades.addGrade(90);
        grades.addGrade(76.2);

        assertEquals(3, grades.getGradeCount());
        assertEquals(90, grades.getMaxGrade());
        assertEquals(76.2, grades.getMinGrade(), 0.0001);
        assertEquals(82.0666666, grades.getAverageGrade(), 0.0001);
    }

    @Test
    public void testFourGrades() {
        grades.addGrade(80);
        grades.addGrade(90);
        grades.addGrade(76.2);
        grades.addGrade(0);

        assertEquals(4, grades.getGradeCount());
        assertEquals(90, grades.getMaxGrade());
        assertEquals(0, grades.getMinGrade(), 0.0001);
        assertEquals(61.55, grades.getAverageGrade(), 0.0001);
    }
}
