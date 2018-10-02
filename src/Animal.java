public class Animal
{
    private String type;
    private String [] continents = new String [7];
    private double weight;
    private int age;

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setContinents(String[] continents)
    {
        this.continents = continents;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public double getWeight()
    {
        return weight;
    }

    public int getAge()
    {
        return age;
    }

    public String getType()
    {
        return type;
    }

    public String[] getContinents()
    {
        return continents;
    }

    public Animal()
    {
        this.continents=null;
        this.type="no type specified";
        this.age=0;
        this.weight=0.00;
    }

    //4 argument constructor

    public Animal(String type, int age,double weight,String[] continents)
    {
        this.type=type;
        this.age=age;
        this.weight=weight;
        this.continents=continents;
    }

    public String toString()
    {
        return "Type: " +getType() + "\nAge: " + getAge()
                + "\nWeight: " + getWeight() + "\nContinent: " + getContinents();
    }
}
