public class Bicycle
{
    private String ownersName;
    private double value;
    private String make;

    //accessor methods

    public String getOwnersName()
    {
        return ownersName;
    }

    public double getValue()
    {
        return value;
    }

    public String getMake()
    {
        return make;
    }

    //mutator methods


    public void setMake(String make)
    {
        this.make = make;
    }

    public void setOwnersName(String ownersName)
    {
        this.ownersName = ownersName;
    }

    public void setValue(double value)
    {
        this.value = value;
    }

    //no argument constructor
    public Bicycle()
    {
        this.ownersName="unknown owner";
        this.make="unknown make";
        this.value=0.00;
    }

    //3 argument constructor
    public Bicycle(String ownersName, String make, double value)
    {
        this.ownersName=ownersName;
        this.make=make;
        this.value=value;
    }



    //toString() method
    @Override
    public String toString()
    {
        return "afbsdfgs";
    }
}
