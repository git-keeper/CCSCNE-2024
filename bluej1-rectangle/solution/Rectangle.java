/**
 * Represents a rectangle by width and height.
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

    public int getArea()
    {
        int area = width * height;
        if (area >= 0)
            return area;
        else
            return 0;
    }
}
