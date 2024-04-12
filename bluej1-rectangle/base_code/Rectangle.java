/**
 * This class represents a rectangle by width and height. The class is not
 * correctly written, because the getArea() method always returns 0. Modify the
 * getArea() method so that it behaves as it is documented.
 *
 * This example is part of the CCSCNE 2024 git-keeper tutorial. See here for
 * more information:
 * https://github.com/git-keeper/CCSCNE-2024
 */
public class Rectangle
{
    private int width;
    private int height;

    public Rectangle(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    /**
     * Returns the area of the rectangle, or 0 if the width or the
     * height is negative.
     */
    public int getArea() {
        return 0;
    }
}
