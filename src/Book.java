public class Book
{
    private String title;
    private double price;
    private String ISBN;
    private int pages;

    //mutator methods

    public void setTitle(String title)
    {
        this.title=title;
    }

    public void setPrice(double price)
    {
        this.price=price;
    }

    public void setISBN(String ISBN)
    {
        this.ISBN=ISBN;
    }

    public void setPages(int pages)
    {
        this.pages=pages;
    }

    //accessor methods


    public String getTitle()
    {
        return title;
    }

    public double getPrice()
    {
        return price;
    }

    public String getISBN()
    {
        return ISBN;
    }

    public int getPages()
    {
        return pages;
    }

    //constructor methods

    public Book()
    {
        this.pages=0;
        this.ISBN="";
        this.price=0.00;
        this.title="Unknown";
    }


    public String toString()
    {
        return "title: " +getTitle() + "\nprice: " + getPrice()
                + "\nISBN: " + getISBN() + "\npages: " + getPages();
    }



    //four argument constructor
    public Book(String title, int pages, String ISBN, int price)
    {
        this.title=title;
        this.price=price;
        this.ISBN=ISBN;
        this.pages=pages;
    }

}
