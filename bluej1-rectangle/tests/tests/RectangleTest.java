import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    private void friendlyAssertAreaEquals(int width, int height, int expected,
                                          int actual) {
        if (expected != actual) {
            String error = "Expected getArea() to return " + expected +
                " when width is " + width + " and height is " + height +
                ". Instead getArea() returned " + actual;
            fail(error);
        }
    }

    private void friendlyAssertGetterEquals(String getter, int expected,
                                            int actual) {
        if (expected != actual) {
            String error = "Expected " + getter + " to return " + expected +
                " when " + expected + " was passed to the constructor. " +
                "Instead " + getter + " returned " + actual;
            fail(error);
        }
    }

    @Test
    public void testGetWidth() {
        Rectangle r1 = new Rectangle(10, 20);
        friendlyAssertGetterEquals("getWidth()", 10, r1.getWidth());

        Rectangle r2 = new Rectangle(30, 100);
        assertEquals(30, r2.getWidth());
    }

    @Test
    public void testGetHeight() {
        Rectangle r1 = new Rectangle(20, 40);
        assertEquals(40, r1.getHeight());

        Rectangle r2 = new Rectangle(50, 200);
        assertEquals(200, r2.getHeight());
    }

    @Test
    public void testGetArea() {
        Rectangle r1 = new Rectangle(4, 5);
        friendlyAssertAreaEquals(4, 5, 20, r1.getArea());

        Rectangle r2 = new Rectangle(60, 70);
        assertEquals(4200, r2.getArea());
    }

    @Test
    public void testGetAreaNegative() {
        Rectangle r1 = new Rectangle(1, -2);
        friendlyAssertAreaEquals(1, -2, 0, r1.getArea());

        Rectangle r2 = new Rectangle(-3, 2);
        friendlyAssertAreaEquals(-3, 2, 0, r2.getArea());

        Rectangle r3 = new Rectangle(-4, -5);
        friendlyAssertAreaEquals(-4, -5, 0, r3.getArea());
    }
}
