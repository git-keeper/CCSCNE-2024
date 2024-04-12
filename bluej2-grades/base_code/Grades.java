import java.util.ArrayList;

/**
 * This class keeps track of grades, which are added one by one using the
 * addGrade() method. We can then use the other methods to get the number
 * of grades, the minimum and maximum grades, and the average grade. However,
 * the class is written such that the getMinGrade(), getMaxGrade(), and 
 * getAverageGrade() methods return awkward values when there have been no
 * grades added. Make changes to this class so that these 3 methods return 0
 * when no grades have been added.
 */
public class Grades 
{
    private final ArrayList<Double> grades;
    private double maxGrade;
    private double minGrade;

    public Grades() 
    {
        grades = new ArrayList<>();
        maxGrade = Double.NEGATIVE_INFINITY;
        minGrade = Double.POSITIVE_INFINITY;
    }

    public void addGrade(double grade) 
    {
        grades.add(grade);
        if (grade > maxGrade)
            maxGrade = grade;
    
        if (grade < minGrade)
            minGrade = grade;

    }

    public double getMaxGrade() 
    {
        return maxGrade;
    }

    public double getMinGrade() 
    {
        return minGrade;
    }

    public int getGradeCount() 
    {
        return grades.size();
    }
    
    public double getAverageGrade() 
    {
        double gradeSum = 0;
        for (double grade : grades) {
            gradeSum += grade;
        }
        return gradeSum / getGradeCount();
    }
}
