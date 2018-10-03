import javax.swing.*;

public class BookDriver
{
    public static void main(String[] args)
    {
        String ISBNdisplay=JOptionPane.showInputDialog("Please enter the ISBN of the book");

        Book Liam = new Book();
        Book Modestas = new Book();
        Liam.setISBN(ISBNdisplay);
        Liam.setPages(16);
        Liam.setPrice(69.00);
        Liam.setTitle("Modestas is a latvian spy");

        Modestas.setISBN("asdfadas556");
        Modestas.setPages(16);
        Modestas.setPrice(69.00);
        Modestas.setTitle("Modestas is a latvian spy");

        JOptionPane.showMessageDialog(null,Liam.toString());
        JOptionPane.showMessageDialog(null,Modestas.toString());
    }
}
