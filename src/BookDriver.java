import javax.swing.*;

public class BookDriver
{
    public static void main(String[] args)
    {
        Book Liam = new Book();
        Book Modestas = new Book();
        Liam.setISBN("asdfadas556");
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
