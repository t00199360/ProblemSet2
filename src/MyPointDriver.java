import javax.swing.*;

public class MyPointDriver
{
    public static void main(String[] args) {
        String XAsString = JOptionPane.showInputDialog(null, "Please enter your x-coordinate");
        String YAsString = JOptionPane.showInputDialog(null, "Please enter your y-coordinate");

        double askForX = Double.parseDouble(XAsString);
        double askForY = Double.parseDouble(YAsString);

        MyPoint firstPoint = new MyPoint();

        JOptionPane.showMessageDialog(null, firstPoint);

        MyPoint myPoint= new MyPoint(askForX,askForY);

        JOptionPane.showMessageDialog(null, myPoint);

        firstPoint.setxVal(-6);
        firstPoint.setyVal(10);

        JOptionPane.showMessageDialog(null, firstPoint);



    }


        /*moveHorizontally(XAsString,askForX);
        moveVertically(YAsString,askForY);

        distanceFromOriginX(askForX);
        distanceFromOriginY(askForY);

        answerDistance(askForX,askForY);



       // Scanner keyboard = new Scanner(System.in);

        //System.out.print("Please enter the x coordinate: ");
        //String xVal = keyboard.nextLine();

       // System.out.print("Please enter the y coordinate: ");
       // int yVal = keyboard.nextInt();

      //  MyPoint myPoint= new MyPoint(xVal,yVal);

    }

    private static void answerDistance(double askForX, double askForY)
    {
        //I cant think of variable names related to x and y coordinates, Brain is fried
        double jeffX=askForX*askForX;
        double mikeY=askForY*askForY;
        double steve=jeffX+mikeY;

        JOptionPane.showMessageDialog(null,"The points you entered are " + steve + " units away from the origin");
    }


    public static double moveHorizontally(String XAsString,double askForX)
    {
        String askHorizontally=JOptionPane.showInputDialog("Do you want to adjust your value horizontally (y-n)?");
        if (askHorizontally.equals("y"))
        {
            XAsString=JOptionPane.showInputDialog("Please enter your new y-value: ");
            askForX=Double.parseDouble(XAsString);
        }

        return askForX;
    }
    public static double distanceFromOriginX(double askForX)
    {
        int i=0;
        double originX=0;


        double distanceOriginX= askForX-originX;

        return distanceOriginX;
    }
    public static double distanceFromOriginY( double askForY)
    {
        int i=0;
        double originY=0;

        double distanceOriginY= askForY-originY;

        return distanceOriginY;
    }*/
    }


/*
* driver should test all the functions of the MyPoint class
* don't need to handle invalid entries
* */