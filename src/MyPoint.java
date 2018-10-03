import javax.swing.*;

public class MyPoint
{
    private double xVal;
    private double yVal;

    //mutator methods


    public void setxVal(double xVal)
    {
        this.xVal = xVal;
    }

    public void setyVal(double yVal)
    {
        this.yVal = yVal;
    }

    //constructor methods


    public double getxVal()
    {
        return xVal;
    }

    public double getyVal()
    {
        return yVal;
    }

    //no argument constructor

    public MyPoint()
    {
        this.xVal=0;
        this.yVal=0;
    }

    //2 argument constructor
    public MyPoint(double xVal,double yVal)
    {
           this.xVal=getxVal();
           this.yVal=getyVal();
    }

    //to string method

    public String toString()
    {
        return  "X-Value: " + getxVal() +
                "\nY-Value: " + getyVal();
    }
}
