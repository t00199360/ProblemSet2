public class Message
{
    private String recipient;
    private String message;
    private String sender;

    //mutator methods

    public void setMessage(String message)
    {
        this.message = message;
    }

    public void setRecipient(String recipient)
    {
        this.recipient = recipient;
    }

    public void setSender(String sender)
    {
        this.sender = sender;
    }

    //accessor methods

    public String getMessage()
    {
        return message;
    }

    public String getRecipient()
    {
        return recipient;
    }

    public String getSender()
    {
        return sender;
    }

    public String toString()
    {
        return "Sent to: " +getRecipient() + "\nMessage: " + getMessage()
                + "\nSent from: " + getSender();
    }
    //constructor method

    public Message()
    {
        this.message="unknown";
        this.sender="unknown";
        this.recipient="unknown";
    }
    //3 argument constructor

    public Message(String message,String recipient, String sender)
    {
        this.message=message;
        this.recipient=recipient;
        this.sender=sender;
    }
}
