package Smartphone;

public class Friend extends Contact {
    private String telNumber;

    public Friend(String name, String telNumber) {
        this.name = name;
        this.telNumber = telNumber;
    }

    public Friend() {
    }

    @Override
    public String toString() {
        return "Friend{" +
                "telNumber='" + telNumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getTelNumber() {
        return telNumber;
    }
}
