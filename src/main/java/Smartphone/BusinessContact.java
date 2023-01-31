package Smartphone;

public class BusinessContact extends Contact {
    private String companyName;
    private String telNumber;

    public BusinessContact() {
    }

    public BusinessContact(String name, String telNumber, String companyName) {
        this.name = name;
        this.telNumber = telNumber;
        this.companyName = companyName;
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
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "BusinessContact{" +
                "companyName='" + companyName + '\'' +
                ", telNumber='" + telNumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
