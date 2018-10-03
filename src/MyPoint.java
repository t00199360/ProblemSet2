/*needs accessor and mutator methods defined for each of its attributes DONE
* needs a toString() method                                             DONE
* needs a no argument constructor to access the attributes indirectly   DONE
* needs a 2 argument constructor to take 2 arguments that represent the 2 attributes    DONE
* should call the mutator methods to set the values in the 2 argument constructor       DONE
* needs to be able to change the values through a moveHorizontally() or vertically      DONE
* code for encapsulation.
* calculate the distance from the origin point by using the pythagorean theorem
* driver should test all functionality of the class*/

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
           this.xVal=xVal;
           this.yVal=yVal;
    }

    //to string method

    public String toString()
    {
        return  "X-Value: " + getxVal() +
                "\nY-Value: " + getyVal();
    }

    public double moveVertically(double yUnits)
    {
        this.yVal+=yUnits;
        return yUnits;
    }
    public double moveHorizontally(double xUnits)
    {
        this.xVal+=xUnits;
        return xUnits;
    }
    public double translatePosition(double yUnits, double xUnits)
    {
        moveHorizontally(xUnits);
        moveVertically(yUnits);
        return;
    }

}
