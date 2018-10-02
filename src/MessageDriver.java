import javax.swing.*;

public class MessageDriver {
    public static void main(String[] args) {
        Message secrets = new Message();
        Message dontreadthis = new Message();
        secrets.setMessage("Im telling the KGB you read my diary");
        dontreadthis.setMessage("Just wait until Putin hears about this treachery");
        secrets.setSender("Putin");
        dontreadthis.setSender("Big Donny Trump In Da House");
        secrets.setRecipient("Edward Snowden");
        dontreadthis.setRecipient("Hillary Clinton");

        JOptionPane.showMessageDialog(null, secrets.toString());
        JOptionPane.showMessageDialog(null, dontreadthis.toString());
    }
}
